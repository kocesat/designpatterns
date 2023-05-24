package com.kocesat.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    // First method: static inner class (what Lombok uses)
    LunchOrder lunchOrder = LunchOrder.builder()
      .bread("Wheat")
      .condiments("Lettuce")
      .dressing("Mayoness")
      .meat("Turkey")
      .build();

//        System.out.println(lunchOrder.getBread());
//        System.out.println(lunchOrder.getCondiments());
//        System.out.println(lunchOrder.getDressing());
//        System.out.println(lunchOrder.getMeat());

    // Second method: Different builder class
    LunchOrderBuilder orderBuilder = new LunchOrderBuilder();
    LunchOrder sandwich = orderBuilder.withBread("Brown")
      .withCondiments("Lettuce")
      .withDressing("Ketchup")
      .withMeat("Kuzu")
      .build();

//        System.out.println("My Sandwich");
//        System.out.println(sandwich.getBread());
//        System.out.println(sandwich.getCondiments());
//        System.out.println(sandwich.getDressing());
//        System.out.println(sandwich.getMeat());

    // performance testing of builder pattern

      // warmup
      int size = 1_000_000;
      performWithBuilder(size, false);
      performWithoutBuilder(size, false);
      // benchmark
      long withBuilderAvg = 0, withoutBuilderAvg = 0;
      int iteration = 100;
      for (int j = 0; j < iteration; j++) {
          withoutBuilderAvg += performWithoutBuilder(size, true);
          withBuilderAvg += performWithBuilder(size, true);
      }
      System.out.println("average with builder: " + (withBuilderAvg/iteration));
      System.out.println("average without builder: " + (withoutBuilderAvg/iteration));
  }

  public static long performWithBuilder(int size, boolean logging) {
      long start = System.currentTimeMillis();
      List<LunchOrder> orderListV2 = new ArrayList<>();
      for (int i = 0; i < size; i++) {
          orderListV2.add(LunchOrder.builder()
            .bread("breadV2")
            .meat("meatV2")
            .condiments("condimentsV2")
            .dressing("dressingV2")
            .build());
      }
      long end = System.currentTimeMillis();
      if (logging)
          System.out.println("With builder elapsed ms: " + (end - start));
      return (end - start);
  }

  public static long performWithoutBuilder(int size, boolean logging) {
      long start = System.currentTimeMillis();
      List<LunchOrder> orderListV1 = new ArrayList<>();
      for (int i = 0; i < size; i++) {
          var order = new LunchOrder();
          order.setBread("breadV1");
          order.setMeat("meatV1");
          order.setCondiments("condimentsV1");
          order.setDressing("dressingV1");
          orderListV1.add(order);
      }
      long end = System.currentTimeMillis();
      if (logging)
          System.out.println("Without builder elapsed ms: " + (end - start));
      return (end - start);
  }
}
