package com.prabin.practice;

import com.google.common.annotations.Beta;
import com.google.common.base.Objects;

public class User {

	/*
	 * Can use fluent builder to generate it Google guave to generate hashcode
	 * and equals
	 */
	private final String firstName;
	private final String lastName;
	private final int age;
	private final String phone;
	private final String address;

	private User(UserBuilder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.phone = builder.phone;
		this.address = builder.address;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(firstName, lastName, age, phone, address);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Beta) {
			final User other = (User) obj;
			return Objects.equal(firstName, other.firstName)
					&& Objects.equal(lastName, other.lastName)
					&& age == other.age // special handling for primitives
					&& Objects.equal(phone, other.phone)
					&& Objects.equal(address, other.address);
		} else {
			return false;
		}
	}

	public static class UserBuilder {

		private final String firstName;
		private final String lastName;
		private int age;
		private String phone;
		private String address;

		public UserBuilder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public UserBuilder age(int age) {
			this.age = age;
			return this;
		}

		public UserBuilder phone(String phone) {
			this.phone = phone;
			return this;
		}

		public UserBuilder address(String address) {
			this.address = address;
			return this;
		}

		public User build() {
			return new User(this);
		}

	}
}
