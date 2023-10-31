package com.example.watchcom.data.authentication

import okhttp3.Interceptor
import okhttp3.Response

class TokenInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val builder = chain.request().newBuilder()
        builder.addHeader("Authorization", "Bearer $TOKEN")
        return chain.proceed(builder.build())
    }

    companion object {
        private const val TOKEN =
            "eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI3YTkzOWYyMjQxMjBjNGViNTE3ZGMzYmMyYzY3Mjk5ZSIsInN1YiI6IjY1MmQ1NGEzMzlhMWE2MDBhZGJmZmUxYyIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.DyVBUIFqWktgWlQ1y0p5MKbUMZzIuyAYAGCakSbFuPY"
    }
}