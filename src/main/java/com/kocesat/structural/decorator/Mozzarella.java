package com.kocesat.structural.decorator;

public class Mozzarella extends ToppingDecorator{
    public Mozzarella(Pizza tempPizza) {
        super(tempPizza);
        System.out.println("Adding Dough");
        System.out.println("Adding Mozzeralla");
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ", Mozzeralla";
    }

    @Override
    public double getCost() {
        return super.getCost() + .50;
    }
}
