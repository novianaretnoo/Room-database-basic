package com.example.roomdb_noviana_25.room

import androidx.room.*

@Dao
interface MovieDao {

    @Insert
    suspend fun addMovie(movie: Movie)

    @Update
    suspend fun updateMovie(movie: Movie)

    @Delete
    suspend fun deleteMovie(movie: Movie)

    @Query ("SELECT * FROM movie")
    suspend fun getMovie():List<Movie>

    @Query ("SELECT * FROM movie WHERE id=:movie_id")
    suspend fun getMovies(movie_id: Int): List<Movie>
}