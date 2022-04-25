package com.kocesat.creational.abstractfactory;

import com.kocesat.creational.abstractfactory.enums.CardType;

public class VisaFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new VisaGoldCard();
            case PLATINUM:
                return new VisaBlackCard();
        }
        return null;
    }

    @Override
    public Validator getValidator(CardType cardType) {
        return new VisaValidator();
    }

}
