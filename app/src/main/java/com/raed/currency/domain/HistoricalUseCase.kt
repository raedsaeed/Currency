package com.raed.currency.domain

import com.raed.currency.R
import com.raed.currency.data.ViewState
import com.raed.currency.data.repo.ICurrencySource
import com.raed.currency.domain.interfaces.IHistoricalUseCase
import com.raed.currency.presentation.uimodels.UICurrency
import com.raed.currency.utils.CurrencyUtils
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject


/**
 * Created By Raed Saeed on 22/04/2022
 */
class HistoricalUseCase @Inject constructor(private val source: ICurrencySource) :
    IHistoricalUseCase {
    override suspend fun getHistoricalInfo(base: String): Flow<ViewState> =
        flow {
            emit(ViewState.Loading)
            val dateList = ArrayList<UICurrency>()
            coroutineScope {
                (1..3).forEach { day ->
                    val calendar = Calendar.getInstance()
                    calendar.add(Calendar.DAY_OF_YEAR, -day)
                    val date = SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH)
                        .format(calendar.time)

                    val history = source.getHistorical(date)
                    if (history.success) {
                        dateList.add(
                            UICurrency(
                                base,
                                CurrencyUtils.getValueOfSymbol(base, history.quotes),
                                date
                            )
                        )
                    } else {
                        emit(ViewState.Error(Error(history.error?.info)))
                    }

                    // Because API give error if I made 2 requests per second
                    delay(1500)

                }

                dateList.map {
                    it.resourceId = R.layout.item_currency_history
                    return@map it
                }
                emit(ViewState.Success<List<UICurrency>>(dateList))
            }
        }
            .catch { error ->
                emit(ViewState.Error(error))
                error.printStackTrace()
            }
            .flowOn(Dispatchers.IO)
}