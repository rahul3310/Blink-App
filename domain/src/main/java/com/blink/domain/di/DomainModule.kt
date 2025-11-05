package com.blink.domain.di

import com.blink.domain.useCase.GetSaveImagesUseCase
import com.blink.domain.useCase.SaveImageUseCase
import org.koin.dsl.module

val domainModule = module{

    // Use Cases
    factory { SaveImageUseCase(get()) }
    factory { GetSaveImagesUseCase(get()) }
}