package com.prabin.interview;

public class BiggerBy2OrMore {
	public int printAorB(int a, int b) {
		if(a - b >= 2) {
			System.out.println(a);
			return a;
		} else if(b - a >= 2) {
			return b;
		} 
		return 0;
		
	}
}
