package com.kocesat.solid.report.service;

import com.kocesat.solid.report.model.ReportGeneratorRequest;

public interface ReportGeneratorService {
    void generate(ReportGeneratorRequest request);
    String getReportName();
}
