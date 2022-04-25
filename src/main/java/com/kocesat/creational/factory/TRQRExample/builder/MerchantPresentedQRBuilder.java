package com.kocesat.creational.factory.TRQRExample.builder;

import com.kocesat.creational.factory.TRQRExample.model.MerchantPresentedQR;

public class MerchantPresentedQRBuilder extends TRQRBuilder implements ITRQRBuilder {

    public MerchantPresentedQR build() {
        return new MerchantPresentedQR(this);
    }

    public MerchantPresentedQRBuilder withField1(String field) {
        field1 = field;
        return this;
    }

    public MerchantPresentedQRBuilder withField2(String field) {
        field2 = field;
        return this;
    }

}
