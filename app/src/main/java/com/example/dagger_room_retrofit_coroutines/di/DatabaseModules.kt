package com.example.dagger_room_retrofit_coroutines.di

import android.content.Context
import androidx.room.Room
import com.example.dagger_room_retrofit_coroutines.db.FakerDB
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModules {
    @Singleton
    @Provides
    fun provideFakerDB(context: Context) : FakerDB{
        return Room.databaseBuilder(context, FakerDB::class.java, "FakerDB").build()
    }
}