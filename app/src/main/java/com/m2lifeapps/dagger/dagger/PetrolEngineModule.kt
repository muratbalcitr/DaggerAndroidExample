package com.m2lifeapps.eventbus.dagger

import com.m2lifeapps.eventbus.car.Engine
import com.m2lifeapps.eventbus.car.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineModule {

    @Binds
   abstract fun  bindEngine(engine: PetrolEngine): Engine
}