package com.prabin.recursive.typebound;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class RecursiveTypeBoundTest {

	@Test
	public void test() {
		String max = RecursiveTypeBound.max(Arrays.asList("a", "b", "q", "d"));
		assertEquals("q", max);
	}

}
