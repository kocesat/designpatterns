package com.kocesat.behavioral.observer.examples.ecommerce;

public class SalihObserver implements StockObserver {
  private String fullName;

  public SalihObserver(String fullName) {
    this.fullName = fullName;
  }

  @Override
  public void stockUpdate(Product product) {
    System.out.println(String.format(
      "%s, product %s with price %s is in stock now!",
      fullName, product.getName(), product.getPrice()
    ));
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

}
