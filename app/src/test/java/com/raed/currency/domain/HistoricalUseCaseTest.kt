package com.raed.currency.domain

import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.google.common.truth.Truth
import com.raed.currency.data.ViewState
import com.raed.currency.data.remote.FakeCurrencyRemoteSource
import com.raed.currency.presentation.uimodels.UICurrency
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.last
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Created By Raed Saeed on 24/04/2022
 */
@ExperimentalCoroutinesApi
@RunWith(AndroidJUnit4::class)
class HistoricalUseCaseTest {
    private lateinit var fakeCurrencyRemoteSource: FakeCurrencyRemoteSource
    private lateinit var historyUseCase: HistoricalUseCase

    companion object {
        const val BASE = "EGP"
    }

    @Before
    fun createUseCase() {
        fakeCurrencyRemoteSource =
            FakeCurrencyRemoteSource(ApplicationProvider.getApplicationContext())
        historyUseCase = HistoricalUseCase(fakeCurrencyRemoteSource)
    }

    @Test
    fun getHistoricalInfo_returnLoadingState() = runBlocking {
        val state = historyUseCase.getHistoricalInfo(BASE).first()
        Truth.assertThat(state).isInstanceOf(ViewState.Loading::class.java)
    }

    @Test
    fun getHistoricalInfo_returnsSuccessState() = runBlocking {
        val state = historyUseCase.getHistoricalInfo(BASE).last()
        Truth.assertThat(state).isInstanceOf(ViewState.Success::class.java)
    }

    @Test
    fun getHistoricalInfo_returnsSuccessStateWithData() = runBlocking {
        val state = historyUseCase.getHistoricalInfo(BASE).last()

        @Suppress("UNCHECKED_CAST")
        val currencyList = (state as ViewState.Success<*>).item as List<UICurrency>

        Truth.assertThat(currencyList.size).isEqualTo(3)
    }
}