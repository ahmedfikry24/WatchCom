package com.example.watchcom.data

import com.example.watchcom.data.authentication.TokenInterceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiManager {
    private const val BASE_URL = "https://api.themoviedb.org/3/"
    private val loggingInterceptor = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }
    private val tokenInterceptor = TokenInterceptor()
    private val okhttpClient = OkHttpClient.Builder().apply {
        addInterceptor(loggingInterceptor)
        addInterceptor(tokenInterceptor)
    }.build()

    private val retrofit = Retrofit.Builder().apply {
        baseUrl(BASE_URL)
        addConverterFactory(GsonConverterFactory.create())
        client(okhttpClient)
    }.build()

    fun callManager() = retrofit.create(ApiService::class.java)
}