package com.prabin.interview;

public class Triangle {

	public void printTriangle(char[] val) {
		for(int i = 1; i < val.length; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(val[j]);
			}
			System.out.println();
		}
	}
}
