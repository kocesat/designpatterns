package com.kocesat.solid.packagex.service;

import com.kocesat.solid.fileread.model.impl.XDataListHolder;
import com.kocesat.solid.fileread.model.impl.XFileDataHolder;
import com.kocesat.solid.fileread.model.impl.YFileDataHolder;
import com.kocesat.solid.fileread.service.FileReadingService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StatService {
    private final FileReadingService fileReadingService;

    public StatService(FileReadingService fileReadingService) {
        this.fileReadingService = fileReadingService;
    }

    public void saveXFile(LocalDate date) {
        XFileDataHolder file = (XFileDataHolder) fileReadingService.readAndSave(new XFileDataHolder(), date);
        System.out.println(file.getFieldX());
        System.out.println(file.getNumberX());
    }

    public void saveYFile(LocalDate date) {
        YFileDataHolder file = (YFileDataHolder) fileReadingService.readAndSave(new YFileDataHolder(), date);
        System.out.println(file.getFieldY());
    }

    public void saveXFiles(LocalDate date) {
        var files = fileReadingService.readToList(new XDataListHolder(), date);
        List<XDataListHolder> xDataListHolders = new ArrayList<>();
        files.forEach(r -> {
            XDataListHolder holder = (XDataListHolder) r;
            xDataListHolders.add(holder);
            System.out.println(holder);
        });
    }
}
