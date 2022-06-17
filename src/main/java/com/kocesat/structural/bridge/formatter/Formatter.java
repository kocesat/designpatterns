package com.kocesat.structural.bridge.formatter;

import com.kocesat.structural.bridge.Detail;

import java.util.List;

public interface Formatter {
    String format(String header, List<Detail> details);
}
