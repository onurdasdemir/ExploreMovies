package com.example.onur.exploremovies.data.source.remote;

import com.example.onur.exploremovies.data.entity.MovieEntity;
import com.example.onur.exploremovies.data.entity.MovieResponse;
import com.example.onur.exploremovies.data.source.remote.network.MovieService;
import com.example.onur.exploremovies.data.source.MovieDataSource;

import java.util.List;

import io.reactivex.Single;
import io.reactivex.functions.Function;

public class UserRemoteDataSource implements MovieDataSource{

    private final MovieService movieService;

    public UserRemoteDataSource(MovieService movieService) {
        this.movieService = movieService;
    }

    @Override
    public Single<List<MovieEntity>> getNowPlayingMovies() {
        return movieService.getNowPlayingMovies().map(new Function<MovieResponse, List<MovieEntity>>() {
            @Override
            public List<MovieEntity> apply(MovieResponse movieEntityMovieResponse) {
                return movieEntityMovieResponse.getResults();
            }
        });
    }
}
