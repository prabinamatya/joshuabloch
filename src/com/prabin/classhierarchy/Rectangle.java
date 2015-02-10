package com.prabin.classhierarchy;

public class Rectangle implements Figure {

	private double length;
	private double breadth;

	public Rectangle(double d, double e) {
		this.length = d;
		this.breadth = e;
	}

	@Override
	public double area() {
		return length * breadth;
	}

}
