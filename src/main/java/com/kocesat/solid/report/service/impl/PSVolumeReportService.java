package com.kocesat.solid.report.service.impl;

import com.kocesat.solid.report.enums.Report;
import com.kocesat.solid.report.model.ReportGeneratorRequest;
import com.kocesat.solid.report.service.ReportGeneratorService;

public class PSVolumeReportService implements ReportGeneratorService {
    @Override
    public void generate(ReportGeneratorRequest request) {
        System.out.println("Generating PS Volume Report for " + request.getDate());
    }

    @Override
    public String getReportName() {
        return Report.PS_VOLUME.getValue();
    }
}
