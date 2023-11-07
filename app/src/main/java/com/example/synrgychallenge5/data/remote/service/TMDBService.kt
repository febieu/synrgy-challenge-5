package com.example.synrgychallenge5.data.remote.service

import com.example.synrgychallenge5.data.remote.response.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface TMDBService {

    /**
     * Find movies using over 30 filters and sort options.
     */
    @GET("discover/movie")
    suspend fun fetchMovies(
        @Query("api_key") apiKey: String = "f6c7c9267315593505339c445012f5e5",
        @Query("with_original_language") withOriginalLanguage: String = "ja",
    ): Response
}