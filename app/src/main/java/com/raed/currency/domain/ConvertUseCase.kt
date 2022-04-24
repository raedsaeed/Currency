package com.raed.currency.domain

import com.raed.currency.R
import com.raed.currency.data.ViewState
import com.raed.currency.domain.interfaces.IConvertUseCase
import com.raed.currency.presentation.uimodels.UICurrency
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
class ConvertUseCase @Inject constructor() : IConvertUseCase {
    override suspend fun getExchangeRatesForCurrency(
        base: String,
        topCurrencies: List<String>,
        quotes: List<UICurrency>?
    ): Flow<ViewState> = flow {
        emit(ViewState.Loading)
        val exchangeRates = CurrencyUtils.getExchangeRatesForCurrency(base, topCurrencies, quotes)
            .map {
                it.resourceId = R.layout.item_exchange_rate
                return@map it
            }
        emit(ViewState.Success(exchangeRates))
    }.catch { error ->
        emit(ViewState.Error(error))
        error.printStackTrace()
    }.flowOn(Dispatchers.IO)
}