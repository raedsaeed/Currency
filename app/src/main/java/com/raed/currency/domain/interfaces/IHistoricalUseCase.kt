package com.raed.currency.domain.interfaces

import com.raed.currency.data.ViewState
import kotlinx.coroutines.flow.Flow


/**
 * Created By Raed Saeed on 22/04/2022
 */
interface IHistoricalUseCase {
    suspend fun getHistoricalInfo(base: String): Flow<ViewState>
}