package com.kocesat.solid.report;

import com.kocesat.solid.report.enums.Report;
import com.kocesat.solid.report.model.ReportGeneratorRequest;
import com.kocesat.solid.report.service.ReportGeneratorService;

import java.time.LocalDate;
import java.util.List;

/**
 * Example of a solid pattern
 */
public class ReportIniationJob {
    public static void main(String[] args) {
        List<String> statisticsList = List.of("str1", "str2");
        ReportGeneratorRequest request = new ReportGeneratorRequest(LocalDate.now());
        request.setStatisticsList(statisticsList);
        for (Report report : Report.values()) {
            ReportGeneratorService service = ReportGenerationConfig.getReportGenerationService(report.getValue());
            System.out.println(String.format("%s initializing...", service.getReportName()));
            service.generate(request);
        }
    }
}
