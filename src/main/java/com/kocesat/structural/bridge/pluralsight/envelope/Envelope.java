package com.kocesat.structural.bridge.pluralsight.envelope;

import com.kocesat.structural.bridge.pluralsight.Detail;
import com.kocesat.structural.bridge.pluralsight.formatter.Formatter;

import java.util.List;

public abstract class Envelope {

    public String print(Formatter formatter) {
        return formatter.format(getHeader(), getDetails());
    }

    public abstract List<Detail> getDetails();

    public abstract String getHeader();
}
