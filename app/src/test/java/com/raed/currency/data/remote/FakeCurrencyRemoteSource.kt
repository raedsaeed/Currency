package com.raed.currency.data.remote

import android.content.Context
import com.google.gson.Gson
import com.raed.currency.data.models.CurrencyResponse
import com.raed.currency.data.repo.ICurrencySource


/**
 * Created By Raed Saeed on 23/04/2022
 */
class FakeCurrencyRemoteSource constructor(private val context: Context) : ICurrencySource {
    override suspend fun getLatest(): CurrencyResponse {
        return Gson().fromJson(readFileText(), CurrencyResponse::class.java)
    }

    override suspend fun getHistorical(startDate: String): CurrencyResponse {
        return Gson().fromJson(readFileText(), CurrencyResponse::class.java)
    }

    private fun readFileText(): String {
        return context.assets.open("currencies.json")
            .bufferedReader().use { it.readText() }
    }
}