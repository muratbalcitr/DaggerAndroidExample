package com.m2lifeapps.eventbus.car

import android.util.Log
import javax.inject.Inject

class DieselEngine : Engine {

    companion object {
        var TAG = "Car"
    }

    private var horsePower: Int = 0

@Inject
    constructor(horsePower: Int) {
        this.horsePower = horsePower
    }

    override fun start() {
        Log.d(TAG, "diesel ENGINE started $horsePower km")
    }
}