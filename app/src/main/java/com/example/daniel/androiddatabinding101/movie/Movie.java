package com.example.daniel.androiddatabinding101.movie;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.daniel.androiddatabinding101.BR;

public class Movie extends BaseObservable {

    public Integer id;

    public String title;

    public String releaseDate;

    public String overview;

    public String rating;

    public Movie(String title, String releaseDate, String overview, String rating) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.overview = overview;
        this.rating = rating;
    }

    public Movie() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Bindable
    public String getTitle() {
        return title;

    }

    public void setTitle(String title) {
        this.title = title;
        notifyPropertyChanged(BR.movie);
    }

    @Bindable
    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
        notifyPropertyChanged(BR.movie);

    }

    @Bindable
    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
        notifyPropertyChanged(BR.movie);

    }

    @Bindable
    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
        notifyPropertyChanged(BR.movie);

    }
}
