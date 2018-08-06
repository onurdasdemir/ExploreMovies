package com.example.onur.exploremovies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.onur.exploremovies.domain.interactor.GetMovieList;

import io.reactivex.functions.Consumer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GetMovieList getMovieList = new GetMovieList(null);
        getMovieList.execute(new GetMovieList.Param(), new Consumer<String>() {
            @Override
            public void accept(String s) throws Exception {

            }
        });
    }
}
