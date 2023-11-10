package com.example.synrgychallenge5.presentation.adapter

import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.synrgychallenge5.databinding.ItemMovieBinding
import com.example.synrgychallenge5.domain.Movie

class MovieViewHolder(
    private val binding: ItemMovieBinding,
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(movie: Movie) {
        binding.tvTitleMovie.text = movie.title
        binding.ivMovie.load(movie.image)
//        binding.ivMovie.load("https://spoonacular.com/recipeImages/w500${movie.image}")
//        binding.tvTitleMovie.text = movie.originalTitle
//        binding.tvDescMovie.text = movie.overview
//        binding.ivMovie.load("https://image.tmdb.org/t/p/w500${movie.posterPath}")
    }
}