package com.raed.currency.domain.interfaces

import com.raed.currency.data.ViewState
import com.raed.currency.data.models.CurrencyResponse
import com.raed.currency.presentation.uimodels.UICurrency
import kotlinx.coroutines.flow.Flow


/**
 * Created By Raed Saeed on 22/04/2022
 */
interface IConvertUseCase {
    suspend fun getExchangeRatesForCurrency(
        base: String,
        topCurrencies : List<String>,
        quotes: List<UICurrency>
    ): Flow<ViewState>
}