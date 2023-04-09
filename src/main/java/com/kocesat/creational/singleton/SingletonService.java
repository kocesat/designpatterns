package com.kocesat.creational.singleton;

public class SingletonService {
  private SingletonService() {}

  public static SingletonService getInstance(){
    return SingletonServiceHelper.instance;
  }

  private static class SingletonServiceHelper {
    private static SingletonService instance = new SingletonService();
  }
}
