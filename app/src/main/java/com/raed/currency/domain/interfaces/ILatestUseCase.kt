package com.raed.currency.domain.interfaces

import com.raed.currency.data.ViewState
import kotlinx.coroutines.flow.Flow


/**
 * Created By Raed Saeed on 22/04/2022
 */
interface ILatestUseCase {
    fun getUpdatedCurrencies(): Flow<ViewState>
}