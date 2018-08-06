package com.example.onur.exploremovies.presentation.movielist;

import com.example.onur.exploremovies.data.entity.MovieEntity;
import com.example.onur.exploremovies.domain.interactor.GetMovieList;
import com.example.onur.exploremovies.domain.mapper.MovieMapper;

import java.util.List;

import io.reactivex.functions.Consumer;

public class MovieListPresenter {

    private final GetMovieList getMovieList;
    private final MovieMapper movieMapper;

    public MovieListPresenter(GetMovieList getMovieList, MovieMapper movieMapper) {
        this.getMovieList = getMovieList;
        this.movieMapper = movieMapper;
    }

    private void getMovies(){
        getMovieList.execute(null, new Consumer<List<MovieEntity>>() {
            @Override
            public void accept(List<MovieEntity> movieEntities) {

            }
        });
    }
}
