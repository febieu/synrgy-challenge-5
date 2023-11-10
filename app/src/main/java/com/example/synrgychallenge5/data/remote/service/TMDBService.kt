package com.example.synrgychallenge5.data.remote.service

import com.example.synrgychallenge5.data.remote.response.MenuItemRespone
import com.example.synrgychallenge5.data.remote.response.RecipesResponse
import com.example.synrgychallenge5.data.remote.response.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface TMDBService {

    /**
     * Find movies using over 30 filters and sort options.
     */
//    @GET("discover/movie")
    @GET("food/menuItems/search")
//    @GET("recipes/complexSearch")
    suspend fun fetchMovies(
        //MenuItem
        @Query("apiKey") apiKey: String = "bf0138bf61ce4a1a9c3bfdc745cf9559",
        @Query("number") number: Int = 100,
        @Query("query") query: String = "pie",

        //Api Recipes
//        @Query("apiKey") apiKey: String = "bf0138bf61ce4a1a9c3bfdc745cf9559",
//        @Query("number") number: Int = 100,
//        @Query("query") query: String = "pasta",
//        @Query("cuisine") cuisine: String = "british",

        //Untuk TMDB
//        @Query("api_key") apiKey: String = "f6c7c9267315593505339c445012f5e5",
//        @Query("with_original_language") withOriginalLanguage: String = "ja",
    ): MenuItemRespone
}