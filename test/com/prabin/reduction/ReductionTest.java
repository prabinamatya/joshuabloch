package com.prabin.reduction;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ReductionTest {

	Reduction testObject = new Reduction();

	@Test
	public void testReduce() {
		List<Integer> intList = Arrays.asList(2, 7, 1, 8, 3, 5, 3, 8, 7, 2, 8);
		System.out.println(testObject.reduce(intList, Reduction.SUM, 0));

	}

}
