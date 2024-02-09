package com.kumuda.jettrivia.di

import com.kumuda.jettrivia.network.QuestionApi
import com.kumuda.jettrivia.repository.QuestionRepository
import com.kumuda.jettrivia.util.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton


@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Singleton
    @Provides
    fun provideQuestionRepository(api: QuestionApi) :QuestionRepository = QuestionRepository(api)


    @Singleton
    @Provides
    fun provideQuestionApi(): QuestionApi {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(QuestionApi::class.java)
    }
}