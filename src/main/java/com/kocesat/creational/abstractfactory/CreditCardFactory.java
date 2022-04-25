package com.kocesat.creational.abstractfactory;

import com.kocesat.creational.abstractfactory.enums.CardType;

public abstract class CreditCardFactory {

    public static CreditCardFactory newInstance(int creditScore) {
        if (creditScore > 650) {
            return new AmexFactory();
        } else {
            return new VisaFactory();
        }
    }

    public abstract CreditCard getCreditCard(CardType cardType);
    public abstract Validator getValidator(CardType cardType);
}
