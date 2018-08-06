package com.example.onur.exploremovies.data.source;

import com.example.onur.exploremovies.data.entity.MovieEntity;
import com.example.onur.exploremovies.data.entity.MovieResponse;

import java.util.List;

import io.reactivex.Single;


public interface MovieDataSource {

    Single<List<MovieEntity>> getNowPlayingMovies();
}
