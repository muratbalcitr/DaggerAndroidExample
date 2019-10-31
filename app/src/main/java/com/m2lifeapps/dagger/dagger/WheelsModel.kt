package com.m2lifeapps.eventbus.dagger

import com.m2lifeapps.eventbus.car.Rims
import com.m2lifeapps.eventbus.car.Tires
import com.m2lifeapps.eventbus.car.Wheels
import dagger.Module
import dagger.Provides

@Module
  class WheelsModel {

         @Provides
         fun provideRims(): Rims {
            return Rims()
        }

        @Provides
        fun provideTires(): Tires {
            val tires = Tires()
            tires.inflate()
            return tires
        }

        @Provides
        fun provideWheels(tires: Tires, rims: Rims): Wheels {
            return Wheels(rims, tires)

    }
}