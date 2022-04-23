package com.raed.currency.data.repo

import android.content.Context
import com.google.gson.Gson
import com.raed.currency.data.models.CurrencyResponse
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject


/**
 * Created By Raed Saeed on 23/04/2022
 */
class TestCurrencyRepo @Inject constructor(@ApplicationContext private val context: Context) : ICurrencyRepo {
    override suspend fun getLatest(): CurrencyResponse {
        return Gson().fromJson(readFileText(), CurrencyResponse::class.java)
    }

    override suspend fun getHistorical(startDate: String): CurrencyResponse {
        return Gson().fromJson(readFileText(), CurrencyResponse::class.java)
    }

    private fun readFileText(): String {
        return context.assets.open("currencies.json").bufferedReader().use { it.readText() }
    }
}