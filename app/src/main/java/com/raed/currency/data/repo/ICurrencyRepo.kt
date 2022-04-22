package com.raed.currency.data.repo

import com.raed.currency.data.models.CurrencyResponse


/**
 * Created By Raed Saeed on 22/04/2022
 */
interface ICurrencyRepo {
    suspend fun getLatest(): CurrencyResponse
    suspend fun getHistorical(startDate: String): CurrencyResponse
}