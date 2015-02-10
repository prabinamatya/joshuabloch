package com.prabin.classhierarchy;

public class MakeFigures {

	public void findAread() {
		Figure rectangle = new Rectangle(4.0, 5.0);
		System.out.println("rectangle area = " + rectangle.area());

		Figure circle = new Circle(6.0);
		System.out.println("circle Area = " + circle.area());

		Figure square = new Square(7.0);
		System.out.println("square  Area= " + square.area());

	}
}
