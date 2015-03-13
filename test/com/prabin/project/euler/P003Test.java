package com.prabin.project.euler;

import static org.junit.Assert.*;

import org.junit.Test;

public class P003Test {

	@Test
	public void testPrimeNumbers() {
		P003 testObject = new P003();
		assertEquals( 11l ,testObject.primeNumbers(600851475143l));
	}

}
