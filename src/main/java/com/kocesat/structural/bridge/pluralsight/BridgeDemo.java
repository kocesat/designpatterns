package com.kocesat.structural.bridge.pluralsight;

import com.kocesat.structural.bridge.pluralsight.envelope.Envelope;
import com.kocesat.structural.bridge.pluralsight.envelope.MovieEnvelope;
import com.kocesat.structural.bridge.pluralsight.formatter.Formatter;
import com.kocesat.structural.bridge.pluralsight.formatter.impl.JsonFormatter;

public class BridgeDemo {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setClassification("Action");
        movie.setTitle("John Wick");
        movie.setRuntime("2:15");
        movie.setYear("2014");

        Formatter jsonFormatter = new JsonFormatter();
        Envelope movieEnvelope = new MovieEnvelope(movie);
        String printedMaterial = movieEnvelope.print(jsonFormatter);
        System.out.println(printedMaterial);
    }
}
