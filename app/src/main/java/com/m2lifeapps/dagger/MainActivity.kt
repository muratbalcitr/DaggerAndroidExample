package com.m2lifeapps.eventbus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.m2lifeapps.eventbus.car.Car
import com.m2lifeapps.eventbus.car.Remote
import com.m2lifeapps.eventbus.dagger.ActivityComponent
import com.m2lifeapps.eventbus.dagger.DaggerActivityComponent
import com.m2lifeapps.eventbus.dagger.ExApp
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car
    @Inject
    lateinit var car1: Car
    @Inject
    lateinit var car2: Car
    @Inject
    lateinit var car3: Car
    @Inject
    lateinit var remote: Remote
    private lateinit var activityComponent: ActivityComponent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        activityComponent = DaggerActivityComponent.builder()
            .horsePower(123)
            .engineCapacity(1231)
            .appComponent(((application as ExApp).getAppComponent()))
            .build()
        activityComponent.inject(this)

        car.drive()
        car1.drive()
        car2.drive()
        car3.drive()
     }
}
