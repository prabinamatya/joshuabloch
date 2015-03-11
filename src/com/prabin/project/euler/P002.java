package com.prabin.project.euler;

//Fibonacci even sum below 4MIL
public class P002 {
	
	public static void main(String... args) {
		System.out.println(fibonacciNumbers());
		
	}
	public static int fibonacciNumbers() {
		int a = 0;
		int b = 1;
		int sum = 0;
		int fibSum = 0;
		for(int i = 1; ; i++) {
			sum = a + b;
			if(sum > 4000000) 
				break;
//			System.out.println(sum);
			if (sum % 2 == 0) {
				fibSum += sum;
//				System.out.println("fibSum = " + fibSum);
			}
			a = b;
			b = sum;
		}
		return fibSum;
	}

}
