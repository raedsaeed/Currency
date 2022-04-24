package com.raed.currency.di

import com.raed.currency.data.repo.CurrencySource
import com.raed.currency.data.repo.ICurrencySource
import com.raed.currency.data.source.remote.ApiService
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
    fun provideCurrencyRemoteDataSource(apiService: ApiService): ICurrencySource =
        CurrencySource(apiService)

    @Provides
    fun provideLatestUseCase(source: ICurrencySource): ILatestUseCase = LatestUseCase(source)

    @Provides
    fun provideConvertUseCase(): IConvertUseCase = ConvertUseCase()

    @Provides
    fun provideHistoricalUseCase(source: ICurrencySource): IHistoricalUseCase =
        HistoricalUseCase(source)
}