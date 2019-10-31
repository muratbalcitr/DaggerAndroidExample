package com.m2lifeapps.eventbus.dagger

import com.m2lifeapps.eventbus.MainActivity
import com.m2lifeapps.eventbus.car.Car
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named
import javax.inject.Singleton


@PerActivity
@Component(dependencies =[ AppComponent::class],  modules = arrayOf(WheelsModel::class, PetrolEngineModule::class))
interface ActivityComponent {
    fun getCar(): Car
    fun inject(activity: MainActivity)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun horsePower(@Named("horse power") horsePower: Int): Builder


        @BindsInstance
        fun engineCapacity(@Named("engineCapacity") engineCapacity: Int): Builder

        fun build(): ActivityComponent

        fun appComponent(component: AppComponent):Builder
    }
}