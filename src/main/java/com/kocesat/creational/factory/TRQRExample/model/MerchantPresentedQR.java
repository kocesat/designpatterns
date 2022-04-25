package com.kocesat.creational.factory.TRQRExample.model;

import com.kocesat.creational.factory.TRQRExample.builder.MerchantPresentedQRBuilder;

public class MerchantPresentedQR extends AbstractBaseTRQR {
    private final String field1;
    private final String field2;

    public MerchantPresentedQR(MerchantPresentedQRBuilder builder) {
        this.field1 = builder.getField1();
        this.field2 = builder.getField2();
    }

    @Override
    public String getQRText() {
        return "QR Text for Merchant Presented QR";
    }
}
