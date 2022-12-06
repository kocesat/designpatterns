package com.kocesat.solid.report.service.impl;

import com.kocesat.solid.report.enums.Report;
import com.kocesat.solid.report.model.ReportGeneratorRequest;
import com.kocesat.solid.report.service.ReportGeneratorService;

import java.util.List;

public class SettlementReportService implements ReportGeneratorService {
    @Override
    public void generate(ReportGeneratorRequest request) {
        List<String> input = List.of("default1", "default2");
        if (request.getStatisticsList() != null) {
            input = request.getStatisticsList();
        }
        StringBuffer buffer = new StringBuffer();
        input.forEach(i -> buffer.append(i));
        System.out.println("Generated Settlement report keyword created:" + buffer.toString());
    }

    @Override
    public String getReportName() {
        return Report.SETTLEMENT.getValue();
    }
}
