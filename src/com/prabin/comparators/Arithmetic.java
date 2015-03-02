package com.prabin.comparators;

import java.math.BigDecimal;

public class Arithmetic {
	
	public static void main(String... args) {
		howManyCandies2();
		
		howManyCandies3();
	}

	private static void howManyCandies3() {
		int itemsBought = 0;
		int funds = 100;
		for(int price = 10; funds >= price; price += 10) {
			itemsBought++;
			funds -= price;
		}
		System.out.println(itemsBought + " items bought");
		System.out.println("money left over " + funds);
	}

	private static void howManyCandies2() {
		final BigDecimal TEN_CENTS = new BigDecimal("0.10");
		
		int itemsBought = 0;
		BigDecimal funds = new BigDecimal("1.00");
		for(BigDecimal price = TEN_CENTS; funds.compareTo(price) >=0; price = price.add(TEN_CENTS)) {
			itemsBought++;
			funds = funds.subtract(price);
		}
		System.out.println("itemsBought = " + itemsBought);
		System.out.println("money left over = " + funds);
	}

}