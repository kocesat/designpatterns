package com.kocesat.solid.fileread.model;

import java.time.LocalDate;
import java.util.List;

public interface DataListHolder {
    List<DataListHolder> readFromCsv(LocalDate date);
}
