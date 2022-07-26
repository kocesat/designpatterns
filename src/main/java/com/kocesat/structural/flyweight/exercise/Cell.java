package com.kocesat.structural.flyweight.exercise;

public class Cell {
  private final int row;
  private final int column;
  private String content;
  private CellStyle style;

  public Cell(int row, int column) {
    this.row = row;
    this.column = column;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public void setStyle(CellStyle style) {
    this.style = style;
  }

  public void render() {
    System.out.printf("(%d, %d): %s [%s]\n", row, column, content, style.getFontFamily());
  }
}
