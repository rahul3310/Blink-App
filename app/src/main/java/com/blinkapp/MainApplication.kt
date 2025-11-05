package com.blinkapp

import android.app.Application
import com.blink.data.repositoryImpl.dataModule
import com.blink.domain.di.domainModule
import com.blinkapp.di.appModule
import org.koin.core.context.startKoin

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            modules(appModule,domainModule, dataModule)
        }
    }
}