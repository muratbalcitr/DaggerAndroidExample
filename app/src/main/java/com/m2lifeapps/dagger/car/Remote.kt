package com.m2lifeapps.eventbus.car

import android.util.Log
import javax.inject.Inject

class Remote {
    companion object{
        var TAG ="car"
    }
    @Inject
    constructor()

    fun setListener(car: Car){
        Log.d(TAG,"$car REMOTE CONNECTED")
    }
}
