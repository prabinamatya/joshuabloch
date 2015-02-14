package com.prabin.reduction.secondway;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Stack2Test {

	@Test
	public void test() {
		List<String> args = Arrays.asList("a", "b", "c", "d");

		Stack2<String> stack = new Stack2<String>();
		for (String arg : args) {
			stack.push(arg);
		}

		while (!stack.isEmpty()) {
			System.out.println(stack.pop().toUpperCase());
		}
	}

}
