package com.raed.currency.presentation.convert

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.raed.currency.data.ViewState
import com.raed.currency.domain.interfaces.IHistoricalUseCase
import com.raed.currency.domain.interfaces.ILatestUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject


/**
 * Created By Raed Saeed on 22/04/2022
 */
@HiltViewModel
class CurrenciesViewModel @Inject constructor(
    private val latestUseCase: ILatestUseCase,
    private val historicalUseCase: IHistoricalUseCase
) : ViewModel() {
    val currenciesFlow = MutableLiveData<ViewState>()

    fun getUpdatedCurrencies() {
        viewModelScope.launch {
            latestUseCase.getUpdatedCurrencies().collectLatest {
                currenciesFlow.postValue(it)
            }
        }
    }
}