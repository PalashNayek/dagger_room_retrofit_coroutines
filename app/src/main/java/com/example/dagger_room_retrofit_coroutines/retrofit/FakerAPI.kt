package com.example.dagger_room_retrofit_coroutines.retrofit

import com.example.dagger_room_retrofit_coroutines.models.Product
import retrofit2.Response
import retrofit2.http.GET

interface FakerAPI {
    @GET("products")
    suspend fun getProducts() : Response<List<Product>>
}