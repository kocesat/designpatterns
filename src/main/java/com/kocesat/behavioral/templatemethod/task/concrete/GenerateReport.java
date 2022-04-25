package com.kocesat.behavioral.templatemethod.task.concrete;

import com.kocesat.behavioral.templatemethod.task.Task;

public class GenerateReport extends Task {
    @Override
    protected void doEcexute() {
        System.out.println("Generating report...");
    }
}
