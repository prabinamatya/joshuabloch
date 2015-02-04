package com.prabin.practice.comparable;

import java.util.Comparator;

public class Fruit implements Comparable<Fruit> {
	private String fruitName;
	private String fruitDesc;
	private int quantity;

	public Fruit(String fruitName, String fruitDesc, int quantity) {
		this.fruitName = fruitName;
		this.fruitDesc = fruitDesc;
		this.quantity = quantity;
	}

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public String getFruitDesc() {
		return fruitDesc;
	}

	public void setFruitDesc(String fruitDesc) {
		this.fruitDesc = fruitDesc;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/*
	 * Compare Fruits on the basis of quantity
	 */
	@Override
	public int compareTo(Fruit compareFruit) {
		return (this.getQuantity() - compareFruit.getQuantity());
	}

	public static Comparator<Fruit> FruitComparator = new Comparator<Fruit>() {

		@Override
		public int compare(Fruit fruit1, Fruit fruit2) {
			String fruitName1 = fruit1.getFruitName();
			String fruitName2 = fruit2.getFruitName();

			return fruitName1.compareTo(fruitName2);
		}

	};

}
