package com.designpattern.factorymethod;

public class MainApp {

	public static void main(String[] args) {
		Restaurant beefResto = new BeefBurgerRestaurant();
        beefResto.orderBurger();  // Example of Dynamic method Dispatch...

        System.out.println("==========================================");

        Restaurant veggieResto = new VeggieBurgerRestaurant();
        veggieResto.orderBurger();

	}

}
