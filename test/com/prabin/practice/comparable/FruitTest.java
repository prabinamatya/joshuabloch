package com.prabin.practice.comparable;

import java.util.Arrays;

import junit.framework.Assert;

import org.junit.Test;

public class FruitTest {

	@Test
	public void test() {

		Fruit[] far = new Fruit[5];
		Fruit f1 = new Fruit("apple", "red apple", 100);
		Fruit f2 = new Fruit("mango", "red apple", 50);
		Fruit f3 = new Fruit("peach", "red apple", 70);
		Fruit f4 = new Fruit("banana", "red apple", 20);
		Fruit f5 = new Fruit("orange", "red apple", 10);

		far[0] = f1;
		far[1] = f2;
		far[2] = f3;
		far[3] = f4;
		far[4] = f5;

		Arrays.sort(far);

		// asserting for ascending array
		Assert.assertEquals(10, far[0].getQuantity());

		for (Fruit f : far) {
			System.out.println(f.getQuantity());
		}

	}

}
