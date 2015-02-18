package com.prabin.recursive.typebound.pecs;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import com.prabin.recursive.typebound.RecursiveTypeBound;

public class RecursiveTypeBoundPecsTest {

	@Test
	public void test() {
		String max = RecursiveTypeBound.max(Arrays.asList("a", "b", "q", "d"));
		assertEquals("q", max);
	}

}
