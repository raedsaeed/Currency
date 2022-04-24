package com.raed.currency.domain

import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.google.common.truth.Truth
import com.raed.currency.data.ViewState
import com.raed.currency.data.remote.FakeCurrencyRemoteSource
import com.raed.currency.presentation.uimodels.UICurrency
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Created By Raed Saeed on 24/04/2022
 */

@ExperimentalCoroutinesApi
@RunWith(AndroidJUnit4::class)
class ConvertUseCaseTest {
    private lateinit var fakeCurrencyRemoteSource: FakeCurrencyRemoteSource
    private lateinit var convertUseCase: ConvertUseCase
    private val currencyList = listOf(
        UICurrency("EGP", 18.53f),
        UICurrency("USD", 1f),
        UICurrency("AED", 3.7f),
        UICurrency("SAR", 3.6f),
    )

    @Before
    fun createUseCase() {
        fakeCurrencyRemoteSource =
            FakeCurrencyRemoteSource(ApplicationProvider.getApplicationContext())
        convertUseCase = ConvertUseCase()
    }

    @Test
    fun getCurrencyListAndConvertIt_returnLoadingState() = runBlocking {
        val state = convertUseCase.getExchangeRatesForCurrency(
            "EGP",
            listOf("USD", "AED", "SAR"),
            currencyList
        )
        Truth.assertThat(state).isInstanceOf(ViewState.Loading::class.java)
    }

}