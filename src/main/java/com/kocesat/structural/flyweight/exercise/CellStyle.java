package com.kocesat.structural.flyweight.exercise;

public class CellStyle {
    private final String fontFamily;
    private int fontSize;
    private boolean isBold;

    public CellStyle(String fontFamily, int fontSize, boolean isBold) {
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
        this.isBold = isBold;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public void setBold(boolean bold) {
        isBold = bold;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public int getFontSize() {
        return fontSize;
    }

    public boolean isBold() {
        return isBold;
    }
}
