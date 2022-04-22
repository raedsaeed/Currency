package com.raed.currency.data.source.remote

import com.raed.currency.data.models.LatestResponse
import retrofit2.http.GET
import retrofit2.http.Query


/**
 * Created By Raed Saeed on 22/04/2022
 */
interface ApiService {
    @GET("live")
    suspend fun getLatest(@Query("access_key") accessKey: String): LatestResponse

    @GET("historical")
    suspend fun getHistorical(@Query("access_key") apiKey: String) : LatestResponse
}