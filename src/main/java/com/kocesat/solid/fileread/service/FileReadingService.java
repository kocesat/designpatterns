package com.kocesat.solid.fileread.service;

import com.kocesat.solid.fileread.model.DataListHolder;
import com.kocesat.solid.fileread.model.FileDataHolder;

import java.time.LocalDate;
import java.util.List;

public interface FileReadingService {
    FileDataHolder readAndSave(FileDataHolder fileDataHolder, LocalDate date);
    List<DataListHolder> readToList(DataListHolder dataListHolder, LocalDate date);
}
