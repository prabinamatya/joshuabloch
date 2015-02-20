package com.prabin.enumtypes;

import org.junit.Test;

public class OperationTest {

	@Test
	public void test() {
		for(Operation op : Operation.values()) {
			System.out.println("for op " + op + " value = "+ op.apply(2, 6));
		}
	
	}

}
