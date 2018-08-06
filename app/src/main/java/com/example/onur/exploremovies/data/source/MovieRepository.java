package com.example.onur.exploremovies.data.source;

import com.example.onur.exploremovies.data.entity.MovieEntity;

import java.util.List;

import io.reactivex.Single;
import io.reactivex.functions.Predicate;

public class MovieRepository implements MovieDataSource {

    private final MovieDataSource remoteMovieDataSource;
    private final MovieDataSource localMovieDataSource;

    public MovieRepository(MovieDataSource remoteMovieDataSource, MovieDataSource localMovieDataSource) {
        this.remoteMovieDataSource = remoteMovieDataSource;
        this.localMovieDataSource = localMovieDataSource;
    }

    @Override
    public Single<List<MovieEntity>> getNowPlayingMovies() {
        return Single.concat(localMovieDataSource.getNowPlayingMovies(), remoteMovieDataSource.getNowPlayingMovies())
                .filter(new Predicate<List<MovieEntity>>() {
                    @Override
                    public boolean test(List<MovieEntity> movieEntities) {
                        return !movieEntities.isEmpty();
                    }
                }).firstOrError();
    }
}
