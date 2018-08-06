package com.example.onur.exploremovies.data.entity;

import java.util.List;

public class MovieResponse {

    private List<MovieEntity> results = null;

    private Integer page;

    private Integer totalResults;

    public List<MovieEntity> getResults() {
        return results;
    }
}
