package com.prabin.generic.stack;

import org.junit.Test;

public class StackTest {

	@Test
	public void test() {
		Stack<String> testObject = new Stack<String>();
		String[] listVal = {"a", "b", "c", "dd"};
		for(String val : listVal) {
			testObject.push(val);
		}
		while(!testObject.isEmpty()) {
			System.out.println(testObject.pop());
		}
	}

}
