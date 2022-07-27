package com.kocesat.structural.decorator.derekbanas;

public class PlainPizza implements Pizza{
    @Override
    public String getDescription() {
        return "Thin Dough";
    }

    @Override
    public double getCost() {
        return 4.00;
    }
}
