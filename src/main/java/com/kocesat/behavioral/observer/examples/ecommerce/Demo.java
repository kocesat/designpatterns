package com.kocesat.behavioral.observer.examples.ecommerce;

import java.math.BigDecimal;

public class Demo {
  public static void main(String[] args) {
    var samsung = new Product("Samsung S23", new BigDecimal("23500.00"));
    var iphone = new Product("Iphone 14 ProMax", new BigDecimal("43500.00"));
    var salih = new SalihObserver("Salih Cantekin");
    var esat = new EsatObserver();
    var amazon = new AmazonMarket();
    amazon.registerObserver(samsung, salih);
    amazon.registerObserver(iphone, esat);
    amazon.notifyForProduct("Samsung S23");
    amazon.notifyForProduct("Iphone 14 ProMax");
  }
}
