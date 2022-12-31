package com.example.dagger_room_retrofit_coroutines

import android.app.Application
import com.example.dagger_room_retrofit_coroutines.di.ApplicationComponent
import com.example.dagger_room_retrofit_coroutines.di.DaggerApplicationComponent

class FakerApplication : Application() {
    lateinit var applicationComponent: ApplicationComponent
    override fun onCreate() {
        super.onCreate()
        //applicationComponent = DaggerApplicationComponent.builder().build() //use API
        applicationComponent = DaggerApplicationComponent.factory().create(this) //user API and Room
    }
}