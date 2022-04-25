package com.kocesat.creational.factory.TRQRExample.builder;

import com.kocesat.creational.factory.TRQRExample.model.AbstractBaseTRQR;

public abstract class TRQRBuilder {
    protected String field1;
    protected String field2;

    public abstract AbstractBaseTRQR build();

    public String getField1() {
        return field1;
    }

    public String getField2() {
        return field2;
    }
}
