package com.raed.currency.domain

import com.raed.currency.data.repo.CurrencyRepo
import com.raed.currency.domain.interfaces.IConvertUseCase
import javax.inject.Inject


/**
 * Created By Raed Saeed on 22/04/2022
 */
class ConvertUseCase @Inject constructor(private val repo : CurrencyRepo) : IConvertUseCase {
}