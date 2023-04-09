package com.kocesat.creational.singleton;

public class Main {
  public static void main(String[] args) {

    SingletonService instance = SingletonService.getInstance();
    SingletonService instance2 = SingletonService.getInstance(); // all the same object
    SingletonService instance3 = SingletonService.getInstance();
    SingletonService instance4 = SingletonService.getInstance();
    System.out.println(instance);
    System.out.println(instance2);
    System.out.println(instance3);
    System.out.println(instance4);
  }
}
