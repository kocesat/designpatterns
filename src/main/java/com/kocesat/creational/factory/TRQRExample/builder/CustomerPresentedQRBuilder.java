package com.kocesat.creational.factory.TRQRExample.builder;

import com.kocesat.creational.factory.TRQRExample.model.CustomerPresentedQR;

public class CustomerPresentedQRBuilder extends TRQRBuilder implements ITRQRBuilder{

    public CustomerPresentedQR build() {
        return new CustomerPresentedQR(this);
    }

    public CustomerPresentedQRBuilder withField1(String field) {
        this.field1 = field;
        return this;
    }

    public CustomerPresentedQRBuilder withField2(String field) {
        this.field2 = field;
        return this;
    }
}
