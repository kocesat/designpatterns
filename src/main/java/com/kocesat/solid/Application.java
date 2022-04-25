package com.kocesat.solid;

import com.kocesat.solid.fileread.service.impl.FileReadingServiceImpl;
import com.kocesat.solid.packagex.service.StatService;

import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        StatService service = new StatService(new FileReadingServiceImpl());
//        service.saveXFile(LocalDate.now());
//        service.saveYFile(LocalDate.now());
        service.saveXFiles(LocalDate.now());
    }
}
