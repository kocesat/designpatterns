package com.kocesat.creational.abstractfactory;

import com.kocesat.creational.abstractfactory.enums.CardType;

public class Main {
    public static void main(String[] args) {

        CreditCardFactory abstractFactory = CreditCardFactory.newInstance(775);
        CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);
        System.out.println(card.getClass());

        abstractFactory = CreditCardFactory.newInstance(600);
        card = abstractFactory.getCreditCard(CardType.GOLD);
        System.out.println(card.getClass());
    }
}
