package com.prabin.reverse.array;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayReverseTest {

	@Test
	public void testReversal() {
		ArrayReverse testObject = new ArrayReverse();
		int passArr[] =  {1, 3, 5, 7, 2};
		int [] expected = testObject.reversal(passArr);
		int [] actual = {2, 7, 5, 3, 1};
		assertArrayEquals(actual, expected);
	}

}
