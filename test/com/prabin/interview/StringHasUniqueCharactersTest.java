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
}
