package com.example.onur.exploremovies.data.source.remote.network;

import com.example.onur.exploremovies.data.entity.MovieEntity;
import com.example.onur.exploremovies.data.entity.MovieResponse;

import io.reactivex.Single;
import retrofit2.http.GET;

public interface MovieService {
    @GET("/movie")
    Single<MovieResponse> getNowPlayingMovies();
}
