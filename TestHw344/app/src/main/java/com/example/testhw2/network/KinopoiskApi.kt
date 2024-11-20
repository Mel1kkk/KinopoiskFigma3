package com.example.testhw2.network

import com.example.testhw2.movieItems.Collection
import com.example.testhw2.movieItems.Gallery
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query


private const val BASE_URL = "https://kinopoiskapiunofficial.tech/"
private const val API_KEY = "b4ea775d-c38b-4a55-abf1-8fa7881b945e"


interface KinopoiskApiInterface{
    @Headers("X-API-KEY: $API_KEY")
    @GET("/api/v2.2/films/collections")
    suspend fun getCollection(@Query("type") type: String, @Query("page") page: Int = 1) : Collection

    @Headers("X-API-KEY: $API_KEY")
    @GET("/api/v2.2/films/{id}/images")
    suspend fun getGallery(@Path("id") Id: Int, @Query("type") type: String) : Gallery
}

object KinopoiskApi{
    val api : KinopoiskApiInterface by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(KinopoiskApiInterface::class.java)
    }
}