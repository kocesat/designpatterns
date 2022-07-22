package com.kocesat.structural.decorator;

public class TomataSauce extends ToppingDecorator{
    public TomataSauce(Pizza tempPizza) {
        super(tempPizza);
        System.out.println("Adding Sauce");
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ", TomatoSauce";
    }

    @Override
    public double getCost() {
        return tempPizza.getCost() + .10;
    }
}
