package com.prabin.project.euler;

//largest prime number with it
public class P003 {
	long largest = 1;

	public long primeNumbers(long number) {
		for (long i = 2; i < number; i++) {
			if (isDivisible(i)) {
				boolean primeNum = isPrime(i);
				if (primeNum) {
					if (i > largest) {
						largest = i;
					}
				}
			}
		}
		return largest;
	}

	public boolean isPrime(long number) {
		for (long i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public boolean isDivisible(long number) {
		for (long i = 2; i < number; i++) {
			if (number % i == 0) {
				return true;
			}
		}
		return false;
	}
}
