package com.example.synrgychallenge5.data.remote

import com.example.synrgychallenge5.data.remote.response.toMovie
import com.example.synrgychallenge5.data.remote.service.TMDBService
import com.example.synrgychallenge5.domain.Movie
import com.example.synrgychallenge5.domain.repository.HomeRepository
import kotlinx.coroutines.delay

class RemoteRepository(
    private val tmdbService: TMDBService,
) : HomeRepository {
    override suspend fun fetchMovies(): List<Movie> {
        return tmdbService.fetchMovies().results?.map { result -> result.toMovie() }.orEmpty()
    }
}