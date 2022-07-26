package com.kocesat.structural.flyweight.exercise;

import java.util.HashMap;
import java.util.Map;

public class CellStyleFactory {
    private Map<String, CellStyle> fontMap = new HashMap<>();

    public CellStyle getCellStyle(String fontFamily, int fontSize, boolean isBold) {
        if (!fontMap.containsKey(fontFamily)) {
            fontMap.put(fontFamily, new CellStyle(fontFamily, 10, false));
        }
        var style = fontMap.get(fontFamily);
        style.setBold(isBold);
        style.setFontSize(fontSize);
        return style;
    }
}
