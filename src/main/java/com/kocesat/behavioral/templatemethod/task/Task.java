package com.kocesat.behavioral.templatemethod.task;

import com.kocesat.behavioral.templatemethod.AuditTrail;

public abstract class Task {
    private AuditTrail auditTrail;

    public Task() {
        this.auditTrail = new AuditTrail();
    };

    public Task(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public final void execute() {
        auditTrail.record();
        doEcexute();
    }

    protected abstract void doEcexute();
}
