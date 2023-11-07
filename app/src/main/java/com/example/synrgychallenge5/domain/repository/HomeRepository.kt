package com.example.synrgychallenge5.domain.repository

import com.example.synrgychallenge5.domain.Movie

interface HomeRepository {
    suspend fun fetchMovies(): List<Movie>
}