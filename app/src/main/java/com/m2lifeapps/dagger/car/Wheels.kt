package com.m2lifeapps.eventbus.car

import javax.inject.Inject

class Wheels {
    private lateinit var rims: Rims
    private lateinit var tires: Tires

    @Inject
    constructor()

    constructor(rims: Rims, tires: Tires) {
        this.rims = rims
        this.tires = tires
    }
}