package com.kocesat.solid.fileread.service.impl;

import com.kocesat.solid.fileread.model.DataListHolder;
import com.kocesat.solid.fileread.model.FileDataHolder;
import com.kocesat.solid.fileread.service.FileReadingService;

import java.time.LocalDate;
import java.util.List;

public class FileReadingServiceImpl implements FileReadingService {
    @Override
    public FileDataHolder readAndSave(FileDataHolder fileDataHolder, LocalDate date) {
        return fileDataHolder.readFromCsv(date);
    }

    @Override
    public List<DataListHolder> readToList(DataListHolder dataListHolder, LocalDate date) {
        return dataListHolder.readFromCsv(date);
    }
}
