package com.raed.currency.domain

import com.raed.currency.R
import com.raed.currency.data.ViewState
import com.raed.currency.data.repo.ICurrencySource
import com.raed.currency.domain.interfaces.ILatestUseCase
import com.raed.currency.utils.CurrencyUtils
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject


/**
 * Created By Raed Saeed on 22/04/2022
 */
class LatestUseCase @Inject constructor(private val source: ICurrencySource) : ILatestUseCase {
    override fun getUpdatedCurrencies(): Flow<ViewState> = flow {
        emit(ViewState.Loading)
        val response = source.getLatest()
        if (response.success) {
            val currencyList = CurrencyUtils.convertToUICurrency(response.quotes)
                .map {
                    it.resourceId = R.layout.item_currency
                    return@map it
                }
            emit(ViewState.Success(currencyList))
        } else {
            emit(ViewState.Error(Error(response.error?.info)))
        }
    }.catch { error ->
        emit(ViewState.Error(error))
        error.printStackTrace()
    }.flowOn(Dispatchers.IO)
}