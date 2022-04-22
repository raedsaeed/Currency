package com.raed.currency.presentation.convert

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.raed.currency.data.ViewState
import com.raed.currency.data.models.LatestResponse
import com.raed.currency.domain.ConvertUseCase
import com.raed.currency.domain.interfaces.IHistoricalUseCase
import com.raed.currency.domain.interfaces.ILatestUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


/**
 * Created By Raed Saeed on 22/04/2022
 */
@HiltViewModel
class CurrenciesViewModel @Inject constructor(
    private val latestUseCase: ILatestUseCase,
    private val historicalUseCase: IHistoricalUseCase,
    private val convertUseCase: ConvertUseCase
) : ViewModel() {
    private val currenciesLiveData = MutableLiveData<ViewState>()
    val _currenciesValue : LiveData<ViewState> = currenciesLiveData


    private val historicalLiveData = MutableLiveData<ViewState>()
    val _historicalLiveData : LiveData<ViewState> = historicalLiveData

    private val convertedLivedData = MutableLiveData<ViewState>()
    val _convertedLivedData : LiveData<ViewState> = convertedLivedData


    fun getUpdatedCurrencies() {
        viewModelScope.launch {
            latestUseCase.getUpdatedCurrencies().collect {
                currenciesLiveData.postValue(it)
            }
        }
    }
    
    fun getHistoricalInfo(base : String) {
        viewModelScope.launch {
            historicalUseCase.getHistoricalInfo(base).collect {
                historicalLiveData.postValue(it)
            }
        }
    }
    
    fun getExchangeRates(base: String, topCurrencies : List<String>, quotes : LatestResponse.Quotes) {
        viewModelScope.launch {
            convertUseCase.getExchangeRatesForCurrency(base, topCurrencies, quotes).collect {
                convertedLivedData.postValue(it)
            }
        }
    }
}