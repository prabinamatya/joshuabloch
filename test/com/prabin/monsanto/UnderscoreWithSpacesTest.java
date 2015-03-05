package com.prabin.monsanto;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnderscoreWithSpacesTest {

	@Test
	public void testSanitizedString() {
		UnderscoreWithSpaces testObject = new UnderscoreWithSpaces();
		String actual = testObject.sanitizedString("this_test_home");
		assertEquals("This test home", actual);	}

}
