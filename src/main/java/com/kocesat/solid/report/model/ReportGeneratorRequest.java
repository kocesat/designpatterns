package com.kocesat.solid.report.model;

import java.time.LocalDate;
import java.util.List;

public class ReportGeneratorRequest {
    private final LocalDate date;
    private List<String> statisticsList;

    public ReportGeneratorRequest(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public List<String> getStatisticsList() {
        return statisticsList;
    }

    public void setStatisticsList(List<String> statisticsList) {
        this.statisticsList = statisticsList;
    }
}
