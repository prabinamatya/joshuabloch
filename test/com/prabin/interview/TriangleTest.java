package com.prabin.interview;

import org.junit.Test;

public class TriangleTest {

	@Test
	public void testPrintTriangle() {
		Triangle testObject = new Triangle();
		String stringVal = "abcdefg";
		char[] charArray = stringVal.toCharArray();
		testObject.printTriangle(charArray);
	}

}
