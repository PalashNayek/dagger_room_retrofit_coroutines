package com.example.dagger_room_retrofit_coroutines.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.dagger_room_retrofit_coroutines.models.Product

@Database(entities = [Product::class], version = 1)
abstract class FakerDB : RoomDatabase() {
    abstract fun getFakerDAO() : FakerDAO
}