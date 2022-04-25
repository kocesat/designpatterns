package com.kocesat.behavioral.templatemethod;

import com.kocesat.behavioral.templatemethod.task.concrete.GenerateReport;
import com.kocesat.behavioral.templatemethod.task.concrete.TransferMoneyTask;

public class Demo {
    public static void main(String[] args) {
        TransferMoneyTask transferMoneyTask = new TransferMoneyTask();
        GenerateReport reportTask = new GenerateReport();
        reportTask.execute();
        transferMoneyTask.execute();
    }
}
