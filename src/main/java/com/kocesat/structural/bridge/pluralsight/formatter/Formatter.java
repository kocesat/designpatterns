package com.kocesat.structural.bridge.pluralsight.formatter;

import com.kocesat.structural.bridge.pluralsight.Detail;

import java.util.List;

public interface Formatter {
    String format(String header, List<Detail> details);
}
