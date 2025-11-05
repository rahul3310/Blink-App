package com.blink.data.repositoryImpl

import com.blink.domain.repository.PickImageRepository
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val dataModule =  module{
    // Repository
    single<PickImageRepository> {
        PickImageRepositoryImpl(androidContext())
    }
}