package com.kocesat.structural.bridge.envelope;

import com.kocesat.structural.bridge.Detail;
import com.kocesat.structural.bridge.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieEnvelope extends Envelope {

    private Movie movie;

    public MovieEnvelope(Movie movie) {
        this.movie = movie;
    }

    @Override
    public List<Detail> getDetails() {
        List<Detail> details = new ArrayList<>();
        details.add(new Detail("Title: ", movie.getTitle()));
        details.add(new Detail("Year: ", movie.getYear()));
        details.add(new Detail("Runtime: ", movie.getRuntime()));
        return details;
    }

    @Override
    public String getHeader() {
        return movie.getClassification();
    }
}
