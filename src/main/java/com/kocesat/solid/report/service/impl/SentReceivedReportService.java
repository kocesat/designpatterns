package com.kocesat.solid.report.service.impl;

import com.kocesat.solid.report.enums.Report;
import com.kocesat.solid.report.model.ReportGeneratorRequest;
import com.kocesat.solid.report.service.ReportGeneratorService;

public class SentReceivedReportService implements ReportGeneratorService {
    @Override
    public void generate(ReportGeneratorRequest request) {
        System.out.println("Generating SentReceived Report for " + request.getDate());
    }

    @Override
    public String getReportName() {
        return Report.SENT_RECEIVED.getValue();
    }
}
