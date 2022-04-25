package com.kocesat.solid.fileread.model.impl;

import com.kocesat.solid.fileread.model.FileDataHolder;

import java.time.LocalDate;

public class YFileDataHolder implements FileDataHolder {
    private String fieldY;

    public YFileDataHolder() {
    }

    @Override
    public FileDataHolder readFromCsv(LocalDate date) {
        this.setFieldY("Field Y");
        return this;
    }

    public String getFieldY() {
        return fieldY;
    }

    public void setFieldY(String fieldY) {
        this.fieldY = fieldY;
    }
}
