package com.m2lifeapps.eventbus.dagger

import com.m2lifeapps.eventbus.car.Drive
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
  class DriveModule {
         @Provides
        @Singleton
        fun providerDrivers(): Drive {
            return Drive()
        }
    }
