package com.raed.currency.domain

import com.raed.currency.data.repo.CurrencyRepo
import com.raed.currency.domain.interfaces.IHistoricalUseCase
import javax.inject.Inject


/**
 * Created By Raed Saeed on 22/04/2022
 */
class HistoricalUseCase @Inject constructor(private val repo: CurrencyRepo) : IHistoricalUseCase {
}