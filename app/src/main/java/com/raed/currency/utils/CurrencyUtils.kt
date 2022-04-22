package com.raed.currency.utils

import com.google.gson.Gson
import com.raed.currency.data.models.LatestResponse
import com.raed.currency.presentation.uimodels.UICurrency
import org.json.JSONObject


/**
 * Created By Raed Saeed on 22/04/2022
 */
object CurrencyUtils {
    fun getValueOfSymbol(base: String, quotes: LatestResponse.Quotes?): Float {
        quotes?.let {
            val json = JSONObject(
                Gson().toJson(
                    quotes,
                    LatestResponse.Quotes::class.java
                )
            )

            json.keys().forEach { symbol ->
                val key = symbol.removeRange(0, 3)
                if (base == key) {
                    return (json.opt(symbol) as Double).toFloat()
                }
            }
        }

        return 0f
    }

    fun convertToUICurrency(item: LatestResponse.Quotes?): List<UICurrency> {
        if (item == null) return emptyList()

        val json = JSONObject(
            Gson().toJson(
                item,
                LatestResponse.Quotes::class.java
            )
        ) // convert the retrieved object to json format for key and value


        val labels = ArrayList<UICurrency>()

        json.keys().forEach { symbol ->
            val key = symbol.removeRange(0, 3)
            val valueOfKey = (json.opt(symbol) as Double).toFloat()
            if (valueOfKey != 0f) {
                labels.add(UICurrency(key, valueOfKey))
            }
        }
        return labels
    }

    fun convertToBaseCurrency(amount: Float, base: UICurrency?, to: UICurrency?): Float {
        if (amount <= 0f || base == null || to == null) return 0f
        return ((base.value / to.value) * amount)
    }

    fun convertBaseToAnotherCurrency(amount: Float, base: UICurrency?, to: UICurrency?): Float {
        if (amount <= 0f || base == null || to == null) return 0f
        return (base.value * to.value * amount)
    }

    fun convertAssetToAnother(
        amount: Float,
        base: UICurrency?,
        from: UICurrency?,
        to: UICurrency?
    ): Float {
        val baseValue = convertToBaseCurrency(
            amount,
            base,
            from
        )
        return convertBaseToAnotherCurrency(
            baseValue.toFloatOrZero(),
            base,
            to
        )
    }
}