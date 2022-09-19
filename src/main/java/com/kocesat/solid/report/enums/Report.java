package com.kocesat.solid.report.enums;

public enum Report {
    SENT_RECEIVED("sentreceived"),
    SETTLEMENT("settlement"),
    PS_VOLUME("psvolume");

    private String value;

    Report(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
