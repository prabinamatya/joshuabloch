package com.prabin.coding.to.interfaces;

public class Employee {
	private Authority authority;

	public Employee(Authority authority) {
		super();
		this.authority = authority;
	}

	public Employee() {
	}

	public String performWork() {
		String action = authority.action();
		return action;
	}
}
