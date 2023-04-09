package com.kocesat.behavioral.observer.examples.ecommerce;

import java.util.HashMap;
import java.util.Map;

public class AmazonMarket {
  private Map<StockObserver, Product> observerProductMap = new HashMap();

  public void registerObserver(Product product, StockObserver observer) {
    observerProductMap.put(observer, product);
  }

  public void unregister(StockObserver observer) {
    observerProductMap.remove(observer);
  }

  public void notifyAllObserver() {
    for (Map.Entry<StockObserver, Product> entry : observerProductMap.entrySet()) {
      entry.getKey().stockUpdate(entry.getValue());
    }
  }

  public void notifyForProduct(String productName) {
    for (Map.Entry<StockObserver, Product> kv : observerProductMap.entrySet()) {
      if (kv.getValue().getName().equals(productName)) {
        kv.getKey().stockUpdate(kv.getValue());
      }
    }
  }
}
