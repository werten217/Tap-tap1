package com.example.tap_tap

import android.app.Application
import com.example.tap_tap.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin
import org.koin.core.logger.Level

class TapApp:Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@TapApp)
            androidLogger(level = Level.DEBUG)
            modules(appModule)
        }
    }
}