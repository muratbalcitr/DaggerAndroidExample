package com.m2lifeapps.eventbus.car

import android.util.Log
import com.m2lifeapps.eventbus.dagger.PerActivity
import javax.inject.Inject

@PerActivity
class Car {
    companion object {
        var TAG = "car"
    }

    private lateinit var engine: Engine
    private lateinit var wheels: Wheels
    lateinit var drive: Drive

    @Inject
    constructor(drive: Drive, engine: Engine, wheels: Wheels) {
        this.drive = drive
        this.engine = engine
        this.wheels = wheels
    }

    constructor()

    fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }

    fun drive() {
        engine.start()
        Log.d(TAG, " \n $drive Drives $this\n")
    }

}