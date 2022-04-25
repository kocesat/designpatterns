package com.kocesat.creational.factory.TRQRExample;

import com.kocesat.creational.factory.TRQRExample.builder.CustomerPresentedQRBuilder;
import com.kocesat.creational.factory.TRQRExample.builder.MerchantPresentedQRBuilder;
import com.kocesat.creational.factory.TRQRExample.builder.P2PQRBuilder;

public class TRQRBuilderFactory {

    public static P2PQRBuilder newP2PQRBuilder() {
        return new P2PQRBuilder();
    }

    public static MerchantPresentedQRBuilder newMerchantPresentedQRBuilder() {
        return new MerchantPresentedQRBuilder();
    }

    public static CustomerPresentedQRBuilder newCustomerPresentedQrBuilder() {
        return new CustomerPresentedQRBuilder();
    }
}
