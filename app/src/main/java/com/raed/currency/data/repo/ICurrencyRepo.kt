package com.raed.currency.data.repo

import com.raed.currency.data.models.LatestResponse


/**
 * Created By Raed Saeed on 22/04/2022
 */
interface ICurrencyRepo {
    suspend fun getLatest(): LatestResponse
    suspend fun getHistorical(startDate: String): LatestResponse
}