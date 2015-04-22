package com.prabin.interview;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHasUniqueCharactersTest {

	StringHasUniqueCharacters testObject = new StringHasUniqueCharacters();
	@Test
	public void hasNonUnique() {
		boolean actual = testObject.hasUnique("abcdeff");
		assertEquals(false, actual);
	}

	@Test
	public void hasUnique() {
		boolean actual = testObject.hasUnique("abcdef");
		assertEquals(true, actual);
	}
	
	@Test
	public void reverseStringTest() {
		String actual = testObject.reverseString("abcdef");
		assertEquals("fedcba", actual);
	}
	
	@Test
	public void permutationStringTest() {
		boolean actual = testObject.permutationString("abcdef" , "bcdafe");
		assertEquals(true, actual);
	}
	
	@Test
	public void compressStringsTest() throws Exception {
		String actual = testObject.compressStrings("aaabbbbccdd");
		assertEquals("a3b4c2d2", actual);
	}
}
