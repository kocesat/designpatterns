package com.kocesat.creational.factory.TRQRExample.model;

public abstract class AbstractBaseTRQR implements TRQR{
    // Common fields to all qr types

    @Override
    public abstract String getQRText();
}
