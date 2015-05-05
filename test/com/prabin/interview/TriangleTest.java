package com.prabin.interview;

import java.util.Arrays;

import org.junit.Ignore;
import org.junit.Test;

public class TriangleTest {
	Triangle testObject = new Triangle();

	@Test
	@Ignore
	public void testPrintTriangle() {
		String stringVal = "abcdefg";
		char[] charArray = stringVal.toCharArray();
		testObject.printTriangle(charArray);
	}

	@Test
	public void combineValues() throws Exception {
		int a[] = {1, 2, 3};
		String b[] = {"a", "b", "c"};
		String[] actual = testObject.combine(a, b);
		String[] expected = {"1", "a", "2", "b", "3", "c"};
		Arrays.equals(expected, actual);
	}
}
