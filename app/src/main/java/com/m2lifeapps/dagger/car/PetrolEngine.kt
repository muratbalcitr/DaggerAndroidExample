package com.m2lifeapps.eventbus.car

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine : Engine {

    companion object{
        var TAG = "Car"
    }
    var horsePower :Int =0
    var engineCapacity:Int =0

    @Inject constructor(@Named("horse power") horsePower : Int, @Named("engineCapacity") engineCapacity:Int){
        this.engineCapacity =engineCapacity
        this.horsePower=horsePower
    }
    override fun start() {
        Log.d(TAG,"\nPETROL ENGINE started => $horsePower km speed \n engine Capacity => $engineCapacity \n")
    }

}