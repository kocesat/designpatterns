package com.kocesat.solid.report;

import com.kocesat.solid.report.service.ReportGeneratorService;
import com.kocesat.solid.report.service.impl.PSVolumeReportService;
import com.kocesat.solid.report.service.impl.SentReceivedReportService;
import com.kocesat.solid.report.service.impl.SettlementReportService;

public class ReportGenerationConfig {
    public static ReportGeneratorService getReportGenerationService(String reportName) {
        switch (reportName) {
            case "sentreceived":
                return new SentReceivedReportService();
            case "settlement":
                return new SettlementReportService();
            case "psvolume":
            default:
                return new PSVolumeReportService();
        }
    }
}
