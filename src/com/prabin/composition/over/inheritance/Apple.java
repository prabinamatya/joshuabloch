package com.prabin.composition.over.inheritance;

public class Apple {
	private Fruit fruit = new Fruit();
	
	public int peel() {
		return fruit.peel();
	}
}
