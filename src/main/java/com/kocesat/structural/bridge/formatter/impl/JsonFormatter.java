package com.kocesat.structural.bridge.formatter.impl;

import com.kocesat.structural.bridge.Detail;
import com.kocesat.structural.bridge.formatter.Formatter;

import java.util.List;

public class JsonFormatter implements Formatter {
    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder sb = new StringBuilder();
        sb.append(header);
        sb.append("\n");

        details.forEach(detail -> {
            sb.append(detail.getLabel());
            sb.append(":");
            sb.append(detail.getValue());
            sb.append("\n");
        });
        return sb.toString();
    }
}
