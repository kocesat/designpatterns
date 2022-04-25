package com.kocesat.behavioral.templatemethod.task.concrete;

import com.kocesat.behavioral.templatemethod.task.Task;

public class TransferMoneyTask extends Task {
    @Override
    protected void doEcexute() {
        System.out.println("Transferring money...");
    }
}
