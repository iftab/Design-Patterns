package com.designpattern.factorymethod;

public class VeggieBurgerRestaurant extends Restaurant{

	@Override
	public Burger createBurger() {
		System.out.println("Creating Veggie Burger...");
		return new VeggieBurger();
	}

}
