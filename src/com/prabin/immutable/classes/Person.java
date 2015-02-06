package com.prabin.immutable.classes;

import java.util.List;

/*
 * mutable classes.
 * Fields are private and final
 * Constructors private or package private
 * Public static factories instead of public constructors 
 * No setter methods
 * Class is declared final -- Don't allow subclassing
 * 
 */
public final class Person {

	private final String name;
	private final int age;
	private final List<String> friends;

	private Person(String name, int age, List<String> friends) {
		this.name = name;
		this.age = age;
		this.friends = friends;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public List<String> getFriends() {
		return friends;
	}

}
