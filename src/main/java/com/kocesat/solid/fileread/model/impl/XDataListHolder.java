package com.kocesat.solid.fileread.model.impl;

import com.kocesat.solid.fileread.model.DataListHolder;

import java.time.LocalDate;
import java.util.List;

public class XDataListHolder implements DataListHolder {
    @Override
    public List<DataListHolder> readFromCsv(LocalDate date) {
        return List.of(new XDataListHolder(), new XDataListHolder());
    }
}
