package com.kocesat.behavioral.observer.examples.ecommerce;

public class EsatObserver implements StockObserver{
  @Override
  public void stockUpdate(Product product) {
    System.out.println(String.format(
      "Esat Koç, product %s with price %s is in stock now",
      product.getName(), product.getPrice()
    ));
  }
}
