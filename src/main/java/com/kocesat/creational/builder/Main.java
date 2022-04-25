package com.kocesat.creational.builder;

public class Main {
    public static void main(String[] args) {
        // First method: static inner class
        LunchOrder.Builder builder = new LunchOrder.Builder();
        LunchOrder lunchOrder = builder.bread("Wheat")
                                        .condiments("Lettuce")
                                        .dressing("Mayoness")
                                        .meat("Turkey")
                                        .build();

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());

        // Second method: Different builder class
        LunchOrderBuilder orderBuilder = new LunchOrderBuilder();
        LunchOrder sandwich = orderBuilder.withBread("Brown")
                .withCondiments("Lettuce")
                .withDressing("Ketchup")
                .withMeat("Kuzu")
                .build();

        System.out.println("My Sandwich");
        System.out.println(sandwich.getBread());
        System.out.println(sandwich.getCondiments());
        System.out.println(sandwich.getDressing());
        System.out.println(sandwich.getMeat());
    }
}
