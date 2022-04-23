package com.raed.currency.data.repo

import com.raed.currency.BuildConfig
import com.raed.currency.data.models.CurrencyResponse
import com.raed.currency.data.source.remote.ApiService
import javax.inject.Inject


/**
 * Created By Raed Saeed on 22/04/2022
 */
class CurrencyRepo @Inject constructor(private val api: ApiService) : ICurrencyRepo {
    override suspend fun getLatest(): CurrencyResponse {
        return api.getLatest(BuildConfig.API_KEY)
    }

    override suspend fun getHistorical(startDate: String): CurrencyResponse {
        return api.getHistorical(BuildConfig.API_KEY, startDate)
    }
}