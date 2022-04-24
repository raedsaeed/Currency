package com.raed.currency.domain

import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.google.common.truth.Truth.assertThat
import com.raed.currency.data.ViewState
import com.raed.currency.data.remote.FakeCurrencyRemoteSource
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.last
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Created By Raed Saeed on 24/04/2022
 */

@ExperimentalCoroutinesApi
@RunWith(AndroidJUnit4::class)
class LatestUseCaseTest {
    private lateinit var fakeCurrencyRemoteSource: FakeCurrencyRemoteSource
    private lateinit var latestUseCase: LatestUseCase

    @Before
    fun createUseCase() {
        fakeCurrencyRemoteSource =
            FakeCurrencyRemoteSource(ApplicationProvider.getApplicationContext())
        latestUseCase = LatestUseCase(fakeCurrencyRemoteSource)
    }

    @Test
    fun readFromJsonFile_andReturnResponse() = runTest {
        val value = fakeCurrencyRemoteSource.getLatest()
        assertThat(value).isNotNull()
    }

    @Test
    fun getLatestCurrencies_returnLoadingState() = runBlocking {
        val state = latestUseCase.getUpdatedCurrencies().first()
        assertThat(state).isInstanceOf(ViewState.Loading::class.java)
    }

    @Test
    fun getLatestCurrencies_returnsSuccessState() = runBlocking {
        val state = latestUseCase.getUpdatedCurrencies().last()
        assertThat(state).isInstanceOf(ViewState.Success::class.java)
    }

    @Test
    fun getLatestCurrencies_returnsSuccessStateWithData() = runBlocking {
        val state = latestUseCase.getUpdatedCurrencies().last()
        val currencyList = (state as ViewState.Success<*>).item
        assertThat(currencyList).isInstanceOf(List::class.java)
    }
}