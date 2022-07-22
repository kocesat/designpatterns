package com.kocesat.structural.decorator;

public class PizzaMaker {
    public static void main(String[] args) {
        // Decoration Chain
        Pizza basicPizza = new TomataSauce(new Mozzarella(new PlainPizza()));
        System.out.println("Ingredients: " + basicPizza.getDescription());
        System.out.println("Cost: " + basicPizza.getCost());

    }
}
