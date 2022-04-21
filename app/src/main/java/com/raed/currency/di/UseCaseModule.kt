package com.raed.currency.di

import com.raed.currency.data.repo.CurrencyRepo
import com.raed.currency.domain.ConvertUseCase
import com.raed.currency.domain.HistoricalUseCase
import com.raed.currency.domain.LatestUseCase
import com.raed.currency.domain.interfaces.IConvertUseCase
import com.raed.currency.domain.interfaces.IHistoricalUseCase
import com.raed.currency.domain.interfaces.ILatestUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


/**
 * Created By Raed Saeed on 02/04/2022
 */
@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {
    @Provides
    fun provideLatestUseCase(repo: CurrencyRepo): ILatestUseCase = LatestUseCase(repo)

    @Provides
    fun provideConvertUseCase(repo: CurrencyRepo): IConvertUseCase = ConvertUseCase(repo)

    @Provides
    fun provideHistoricalUseCase(repo: CurrencyRepo): IHistoricalUseCase = HistoricalUseCase(repo)
}