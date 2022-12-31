package com.example.dagger_room_retrofit_coroutines.di

import android.content.Context
import com.example.dagger_room_retrofit_coroutines.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModules::class, DatabaseModules::class])
interface ApplicationComponent {
    fun inject(mainActivity: MainActivity)

    //run time context (room database)
    @Component.Factory
    interface Factory{
        fun create(@BindsInstance context: Context) : ApplicationComponent
    }
}