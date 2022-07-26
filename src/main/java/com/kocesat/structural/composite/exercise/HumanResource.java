package com.kocesat.structural.composite.exercise;

public class HumanResource implements Resource {

  @Override
  public void deploy() {
    System.out.println("Deploying a human resource");
  }
}
