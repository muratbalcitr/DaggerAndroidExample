package com.m2lifeapps.eventbus.dagger

import com.m2lifeapps.eventbus.car.Drive
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [DriveModule::class])

interface AppComponent  {

    fun getDrive():Drive
}