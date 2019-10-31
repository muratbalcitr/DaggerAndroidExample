package com.m2lifeapps.eventbus.dagger

import com.m2lifeapps.eventbus.car.DieselEngine
import com.m2lifeapps.eventbus.car.Engine
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
  class DieselEngineModule {

    var horsePower:Int=0

    constructor(horsePower: Int) {
        this.horsePower = horsePower
    }

    @Provides
    fun horsepower():Int{
        return horsePower
    }

    @Provides
     fun  provideEngine(engine: DieselEngine):Engine{
        return engine
    }
}