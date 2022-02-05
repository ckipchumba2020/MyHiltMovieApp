package com.example.myhiltmovieapp.models


import com.google.gson.annotations.SerializedName

/**
 * Response from TMDB API
 */
data class MovieResponse(
    val page: Int,

    @SerializedName("results")
    val movies: List<Movie>,

    @SerializedName("total_pages")
    val totalPages: Int,

    @SerializedName("total_results")
    val totalResults: Int
)