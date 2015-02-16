package com.prabin.bounded.wildcard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

public class BoundedStackTest {

	@Test
	public void test() {
		BoundedStack<Number> testObject = new BoundedStack<Number>();
		Iterable<Integer> integers = Arrays.asList(3, 1, 4, 1, 5, 9);
		testObject.pushAll(integers);
		
		Collection<Object> objects = new ArrayList<Object>();
		testObject.popAll(objects);
		
		System.out.println(objects);
	}

}
