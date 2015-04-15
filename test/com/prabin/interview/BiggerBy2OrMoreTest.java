package com.prabin.interview;

import static org.junit.Assert.*;

import org.junit.Test;

public class BiggerBy2OrMoreTest {

	@Test
	public void test() {
		BiggerBy2OrMore testObject = new BiggerBy2OrMore();
		int actual = testObject.printAorB(2, 4);
		assertEquals(4, actual);
	}

}
