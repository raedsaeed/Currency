package com.raed.currency.data.repo

import com.raed.currency.BuildConfig
import com.raed.currency.data.models.LatestResponse
import com.raed.currency.data.source.remote.ApiService
import javax.inject.Inject


/**
 * Created By Raed Saeed on 22/04/2022
 */
class CurrencyRepo @Inject constructor(private val api: ApiService) : ICurrencyRepo {
    override suspend fun getLatest(): LatestResponse {
        return api.getLatest(BuildConfig.API_KEY)
    }

    override suspend fun getHistorical(startDate: String): LatestResponse {
        return api.getLatest(BuildConfig.API_KEY)
    }
}