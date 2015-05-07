package com.prabin.interview;

import static org.junit.Assert.*;

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
	@Ignore
	public void combineValues() throws Exception {
		int a[] = {1, 2, 3};
		String b[] = {"a", "b", "c"};
		String[] expected = {"1", "a", "2", "b", "3", "c"};
		assertArrayEquals(expected, testObject.combine(a, b));
	}
	
	@Test
	public void combineToBiggest() throws Exception {
		int [] a = {5, 20, 9, 1};
		int actual = testObject.biggestNumber(a);
		assertEquals(95201, actual);
	}
	
	@Test
//	@Ignore
	public void sortBiggestNumber() throws Exception {
		int [] a = {5, 20, 9, 1};
		int[] actual = testObject.sortedBySize(a);
		int [] expected = {9, 5, 20, 1};
		assertArrayEquals(expected, actual);
	}
}
