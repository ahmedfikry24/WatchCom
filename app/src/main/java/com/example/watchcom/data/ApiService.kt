package com.example.watchcom.data

import com.example.watchcom.data.dto.MovieDetailsDto
import com.example.watchcom.data.dto.NowPlayingDto
import com.example.watchcom.data.dto.PopularDto
import com.example.watchcom.data.dto.TopRatedDto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("movie/now_playing")
    suspend fun getNowPlayingMovies(): Response<NowPlayingDto>

    @GET("movie/popular")
    suspend fun getPopularMovies(): Response<PopularDto>

    @GET("movie/top_rated")
    suspend fun getTopRatedMovies(): Response<TopRatedDto>

    @GET("movie/{movie_id}")
    suspend fun getMovieDetails(@Path("movie_id") movieId: Int): Response<MovieDetailsDto>

}