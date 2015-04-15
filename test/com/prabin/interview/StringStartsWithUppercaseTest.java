package com.prabin.interview;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringStartsWithUppercaseTest {
	StringStartsWithUppercase testObject = new StringStartsWithUppercase();

	@Test
	public void returnsTrueWhenTestingCapitalLetters() {
		assertEquals(Boolean.TRUE, testObject.startsWithUpperCase("Z"));
		assertEquals(Boolean.TRUE, testObject.startsWithUpperCase("A"));
	}
	
	@Test
	public void returnsFalseWhenTestingSmallLetters() {
		assertEquals(Boolean.FALSE, testObject.startsWithUpperCase("z"));
		assertEquals(Boolean.FALSE, testObject.startsWithUpperCase("a"));
	}

}
