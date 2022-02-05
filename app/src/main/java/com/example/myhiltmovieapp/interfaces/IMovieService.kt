package com.example.myhiltmovieapp.interfaces

import com.example.myhiltmovieapp.models.MovieDescription
import com.example.myhiltmovieapp.models.MovieResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Defines Http Requests
 */
interface IMovieService {

    @GET("/3/trending/movie/week")
    suspend fun getMovies(): Response<MovieResponse>

    @GET("/3/movie/{id}")
    suspend fun getSingleMovie(@Path("id") id: Int): Response<MovieDescription>
}