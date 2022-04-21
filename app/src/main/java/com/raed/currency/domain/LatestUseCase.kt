package com.raed.currency.domain

import com.raed.currency.data.repo.CurrencyRepo
import com.raed.currency.domain.interfaces.ILatestUseCase
import javax.inject.Inject


/**
 * Created By Raed Saeed on 22/04/2022
 */
class LatestUseCase @Inject constructor(repo : CurrencyRepo) : ILatestUseCase {
}