package com.black.router.demo

import android.app.Application
import com.black.router.BlackRouter

class MyApp() : Application() {
    override fun onCreate() {
        super.onCreate()
        BlackRouter.getInstance().init(this)
    }
}