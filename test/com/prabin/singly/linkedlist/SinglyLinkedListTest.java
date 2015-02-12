package com.prabin.singly.linkedlist;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class SinglyLinkedListTest {

	@Test
	public void test() {
		SinglyLinkedList testObject = new SinglyLinkedList();
		assertTrue(testObject.isEmpty());
		assertEquals(0, testObject.length());
		
		testObject.append("ABCD");
		assertFalse(testObject.isEmpty());
		assertEquals(1, testObject.length());
	}
	

}
