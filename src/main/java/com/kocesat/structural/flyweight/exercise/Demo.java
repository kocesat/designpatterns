package com.kocesat.structural.flyweight.exercise;

public class Demo {
  public static void main(String[] args) {
    var sheet = new SpreadSheet(new CellStyleFactory());
    sheet.setContent(0, 0, "Hello");
    sheet.setContent(1, 0, "World");
    sheet.setFontFamily(0, 0, "Arial");
    sheet.render();
  }
}
