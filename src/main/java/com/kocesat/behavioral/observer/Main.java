package com.kocesat.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        var dataSource = new DataSource();
        var sheet1 = new SpreadSheet(dataSource);
        var sheet2 = new SpreadSheet(dataSource);
        var chart = new Chart(dataSource);

        dataSource.addObservable(sheet1);
        dataSource.addObservable(sheet2);
        dataSource.addObservable(chart);

        dataSource.setValue(1);
    }
}
