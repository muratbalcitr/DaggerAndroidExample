package com.m2lifeapps.eventbus.dagger

import android.app.Application

class ExApp : Application() {

    private lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
      }

    fun getAppComponent(): AppComponent {
        return appComponent
    }
}