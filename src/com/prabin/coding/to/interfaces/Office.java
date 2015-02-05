package com.prabin.coding.to.interfaces;


public class Office {

	public void work() {
		Employee e1 = new Employee(new Salesman());
		Employee e2 = new Employee(new Manager());

		System.out.println("e1 work salesman" + e1.performWork());
		System.out.println("e2 work manager" + e2.performWork());

	}
}
