package com.kocesat.creational.factory.TRQRExample;

import com.kocesat.creational.factory.TRQRExample.builder.CustomerPresentedQRBuilder;
import com.kocesat.creational.factory.TRQRExample.builder.P2PQRBuilder;
import com.kocesat.creational.factory.TRQRExample.model.TRQR;

public class Main {
    public static void main(String[] args) {

        P2PQRBuilder p2PQRBuilder = (P2PQRBuilder) TRQRBuilderFactory.newP2PQRBuilder();
        TRQR qrModel = p2PQRBuilder.withField1("Field 1")
                                            .withField2("Field 2").build();
        System.out.println(qrModel.getQRText());

        CustomerPresentedQRBuilder customerPresentedQRBuilder = TRQRBuilderFactory.newCustomerPresentedQrBuilder();
        qrModel = customerPresentedQRBuilder.withField1("Alan 1")
                .withField2("Alan 2")
                .build();

        System.out.println(qrModel.getQRText());

    }
}
