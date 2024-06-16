package com.designpattern.factorymethod;

public abstract class Restaurant {
	
  public void orderBurger() {
	  System.out.println("Ordering Burger...");
	  Burger burger = createBurger(); // Return Object instance.
	  burger.prepare(); 
  }
  
  public abstract Burger createBurger();
}
