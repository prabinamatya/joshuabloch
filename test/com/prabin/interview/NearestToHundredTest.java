package com.prabin.interview;

import static org.junit.Assert.*;

import org.junit.Test;

public class NearestToHundredTest {

	@Test
	public void testNearestToHundred() {
		NearestToHundred testObject = new NearestToHundred();
		int actual = testObject.nearestToHundred(25, 75);
		assertEquals(75, actual);
	}

}
