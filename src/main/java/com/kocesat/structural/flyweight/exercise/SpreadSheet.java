package com.kocesat.structural.flyweight.exercise;

public class SpreadSheet {
  private final int MAX_ROWS = 3;
  private final int MAX_COLS = 3;
  private final CellStyleFactory styleFactory;
  private String fontFamily = "Times New Roman";

  private Cell[][] cells = new Cell[MAX_ROWS][MAX_COLS];

  public SpreadSheet(CellStyleFactory styleFactory) {
    this.styleFactory = styleFactory;
    generateCells();
  }

  public void setContent(int row, int col, String content) {
    ensureCellExists(row, col);

    cells[row][col].setContent(content);
  }

  public void setFontFamily(int row, int col, String fontFamily) {
    ensureCellExists(row, col);

    var cell = cells[row][col];
    cells[row][col].setStyle(styleFactory.getCellStyle(fontFamily, 12, false));
  }

  private void ensureCellExists(int row, int col) {
    if (row < 0 || row >= MAX_ROWS)
      throw new IllegalArgumentException();

    if (col < 0 || col >= MAX_COLS)
      throw new IllegalArgumentException();
  }

  private void generateCells() {
    for (var row = 0; row < MAX_ROWS; row++)
      for (var col = 0; col < MAX_COLS; col++) {
        var cell = new Cell(row, col);
        cell.setStyle(getDefaultStyle());
        cells[row][col] = cell;
      }
  }

  public void render() {
    for (var row = 0; row < MAX_ROWS; row++)
      for (var col = 0; col < MAX_COLS; col++)
        cells[row][col].render();
  }

  private CellStyle getDefaultStyle() {
    // In a real app, these values should not be hardcoded here.
    // They should be read from a configuration file.
    return styleFactory.getCellStyle("Times New Roman", 12, false);
  }
}
