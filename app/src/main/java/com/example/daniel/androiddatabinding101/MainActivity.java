package com.example.daniel.androiddatabinding101;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.daniel.androiddatabinding101.databinding.ActivityMainBinding;
import com.example.daniel.androiddatabinding101.movie.Movie;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding movieDetailsBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        movieDetailsBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setMovie();
        updateWithNewMovie();
    }

    private void updateWithNewMovie() {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                Movie movie = new Movie("Corra que a policia vem ai 2", "20-08-1990", "Mudou blablabla", "7.3");
                movieDetailsBinding.setMovie(movie);

            }
        }, TimeUnit.SECONDS.toMillis(5), 1);
    }

    public void setMovie() {
        Movie movie = new Movie("Corra que a policia vem ai", "20-08-1988", "Resumo do filme. blablabla", "5.2");
        movieDetailsBinding.setMovie(movie);
    }
}
