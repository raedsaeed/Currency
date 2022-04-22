package com.raed.currency.domain

import com.raed.currency.data.ViewState
import com.raed.currency.data.repo.CurrencyRepo
import com.raed.currency.domain.interfaces.IHistoricalUseCase
import com.raed.currency.presentation.uimodels.UICurrency
import com.raed.currency.utils.CurrencyUtils
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.withContext
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject


/**
 * Created By Raed Saeed on 22/04/2022
 */
class HistoricalUseCase @Inject constructor(private val repo: CurrencyRepo) : IHistoricalUseCase {
    override suspend fun getHistoricalInfo(base: String): Flow<ViewState> =
        flow<ViewState> {
            emit(ViewState.Loading)
            val dateList = ArrayList<UICurrency>()
            coroutineScope {
                (0..2).map { day ->
                    withContext(Dispatchers.IO) {
                        val date = SimpleDateFormat(
                            "yyyy-MM-dd",
                            Locale.ENGLISH
                        ).format(Calendar.getInstance().add(Calendar.DAY_OF_YEAR, -day))
                        val history = repo.getHistorical(date)
                        dateList.add(
                            UICurrency(
                                base,
                                CurrencyUtils.getValueOfSymbol(base, history.quotes),
                                date
                            )
                        )
                    }
                }
            }
        }
            .catch { error ->
                emit(ViewState.Error(error))
                error.printStackTrace()
            }
            .flowOn(Dispatchers.IO)
}