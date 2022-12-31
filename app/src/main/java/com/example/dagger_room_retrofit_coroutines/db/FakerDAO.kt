package com.example.dagger_room_retrofit_coroutines.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.dagger_room_retrofit_coroutines.models.Product

@Dao
interface FakerDAO {
    @Insert
    suspend fun addProducts(products : List<Product>)

    @Query("SELECT * FROM Product")
    suspend fun getProducts() : List<Product>
}