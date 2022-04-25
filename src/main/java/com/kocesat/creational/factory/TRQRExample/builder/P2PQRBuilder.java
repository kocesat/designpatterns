package com.kocesat.creational.factory.TRQRExample.builder;

import com.kocesat.creational.factory.TRQRExample.model.PeerToPeerQR;

public class P2PQRBuilder extends TRQRBuilder implements ITRQRBuilder{

    public PeerToPeerQR build() {
        return new PeerToPeerQR(this);
    }

    public P2PQRBuilder withField1(String field) {
        field1 = field;
        return this;
    }

    public P2PQRBuilder withField2(String field) {
        field2 = field;
        return this;
    }

}
