package com.prabin.comparators;

import java.util.Comparator;

public class BrokenComparator {
	
	public static void main(String... args) {
		Comparator<Integer> naturalOrder = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				int f = o1;
				int s = o2;
				return f < s ? -1 : (f == s ? 0 : 1);
			}
			
		};
		
		int result = naturalOrder.compare(new Integer(45), new Integer(45));
		System.out.println(result);
	}

}
