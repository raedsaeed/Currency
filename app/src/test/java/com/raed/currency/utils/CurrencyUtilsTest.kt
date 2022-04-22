package com.raed.currency.utils

import com.google.common.truth.Truth.assertThat
import com.raed.currency.data.models.CurrencyResponse
import com.raed.currency.presentation.uimodels.UICurrency
import org.junit.Test

/**
 * Created By Raed Saeed on 22/04/2022
 */
class CurrencyUtilsTest {
    @Test
    fun getValueOfSymbol_different_returnsZero() {
        val aed = CurrencyResponse.Quotes()
        aed.USDAED = 4.5f
        val value = CurrencyUtils.getValueOfSymbol("USD", aed)
        assertThat(value).isEqualTo(0f)
    }

    @Test
    fun getValueOfSymbol_empty_returnsZero() {
        val value = CurrencyUtils.getValueOfSymbol("USD", null)
        assertThat(value).isEqualTo(0f)
    }

    @Test
    fun getValueOfSymbol_full_returnsData() {
        val aed = CurrencyResponse.Quotes()
        aed.USDAED = 4.5f
        val value = CurrencyUtils.getValueOfSymbol("AED", aed)
        assertThat(value).isEqualTo(4.5f)
    }

    @Test
    fun getUICurrency_full_returnFullData() {
        val quote = CurrencyResponse.Quotes()
        quote.USDAED = 4.5f
        quote.USDEGP = 18.5f
        quote.USDUSD = 1f
        val newList = CurrencyUtils.convertToUICurrency(quote)
        assertThat(newList.size).isEqualTo(3)
    }

    @Test
    fun getUICurrency_null_returnsZero() {
        val newList = CurrencyUtils.convertToUICurrency(null)
        assertThat(newList.size).isEqualTo(0)
    }

    @Test
    fun convertToBaseQuote_1EGPto1USD_returnsCorrect() {
        val value =
            CurrencyUtils.convertToBaseCurrency(
                1f,
                UICurrency("USD", 1f),
                UICurrency("EGP", 18.58f)
            )
        assertThat(value).isEqualTo(0.053821314f)
    }

    @Test
    fun convertToBaseQuote_5EGPto1USD_returnsCorrect() {
        val value =
            CurrencyUtils.convertToBaseCurrency(
                5f,
                UICurrency("USD", 1f),
                UICurrency("EGP", 18.58f)
            )
        assertThat(value).isEqualTo(0.26910657f)
    }

    @Test
    fun convertToExchange_1USDtoEGP_returnsCorrect() {
        val value = CurrencyUtils.convertBaseToAnotherCurrency(
            1f,
            UICurrency("USD", 1f),
            UICurrency("EGP", 18.58f)
        )
        assertThat(value).isEqualTo(18.58f)
    }

    @Test
    fun convertToExchange_5USDtoEGP_returnsCorrect() {
        val value = CurrencyUtils.convertBaseToAnotherCurrency(
            5f,
            UICurrency("USD", 1f),
            UICurrency("EGP", 18.58f)
        )
        assertThat(value).isEqualTo(92.9f)
    }

    @Test
    fun convertCurrencyToOther_withoutDollar_1EGPto1TRY_returnsCorrectValue() {
        val value = CurrencyUtils.convertAssetToAnother(
            1f,
            UICurrency("USD", 1f),
            UICurrency("EGP", 18.58f),
            UICurrency("TRY", 14.79f)
        )
        assertThat(value).isEqualTo(0.7960172f)
    }

    @Test
    fun convertCurrencyToTop10_1EGPtoTryAedCad_returnsCorrectValue() {
        val quotes = CurrencyResponse.Quotes()
        quotes.USDUSD = 1f
        quotes.USDEGP = 18.53f
        quotes.USDGBP = 0.774525f
        quotes.USDAED = 3.673099f
        quotes.USDSAR = 3.750463f
        val topCurrencies = listOf("USD", "GBP", "AED", "SAR")
        val exchangeRates = CurrencyUtils.getExchangeRatesForCurrency("EGP", topCurrencies, quotes)
        assertThat(exchangeRates.size).isEqualTo(topCurrencies.size)
    }
}