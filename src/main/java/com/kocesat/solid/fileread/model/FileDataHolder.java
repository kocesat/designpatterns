package com.kocesat.solid.fileread.model;

import java.time.LocalDate;

public interface FileDataHolder {
    FileDataHolder readFromCsv(LocalDate date);
}
