package com.kocesat.solid.fileread.model.impl;

import com.kocesat.solid.fileread.model.FileDataHolder;

import java.time.LocalDate;

public class XFileDataHolder implements FileDataHolder {
    private String fieldX;
    private int numberX;

    public XFileDataHolder() {
    }

    @Override
    public FileDataHolder readFromCsv(LocalDate date) {
        this.fieldX = "Field X";
        this.numberX = 5;
        return this;
    }

    public String getFieldX() {
        return fieldX;
    }

    public void setFieldX(String fieldX) {
        this.fieldX = fieldX;
    }

    public int getNumberX() {
        return numberX;
    }

    public void setNumberX(int numberX) {
        this.numberX = numberX;
    }
}
