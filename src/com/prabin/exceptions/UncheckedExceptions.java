package com.prabin.exceptions;

public class UncheckedExceptions {

	/*
	 * Unchecked exceptions are not checked at compile time. It occurs due to
	 * the bad data provided by user during the user-program interaction
	 */
	public static void main(String... args) {
		int num1 = 10;
		int num2 = 0;

		int res = 0;
		try {
			res = num1 / num2;

			/*
			 * Here we are catching checked exception. 
			 */
		} catch (ArithmeticException ex) {
			System.out.println(ex);
		}

		System.out.println(res);
	}

}
