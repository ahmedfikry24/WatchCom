package com.example.watchcom.data

import retrofit2.http.GET
interface ApiService {
    @GET("movie/popular")
    suspend fun getPopularMovies()
}