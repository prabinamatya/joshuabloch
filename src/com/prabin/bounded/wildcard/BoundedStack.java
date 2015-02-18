package com.prabin.bounded.wildcard;

import java.util.Arrays;
import java.util.Collection;
import java.util.EmptyStackException;

public class BoundedStack<E> {

	private E[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;

	public BoundedStack() {
		elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
	}

	public void push(E e) {
		ensureCapacity();
		elements[size++] = e;
	}

	private void ensureCapacity() {
		if (elements.length == size) {
			elements = Arrays.copyOf(elements, 2 * size + 1);
		}
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public E pop() {
		if (size == 0) {
			throw new EmptyStackException();
		}
		E result = elements[--size];
		elements[size] = null;
		return result;
	}

	/*
	 * http://stackoverflow.com/questions/2723397/java-generics-what-is-pecs
	 * 
	 * wildcard bound  
      upper bound          ? extends SuperType
      lower bound          ? super   SubType
	 * 
	 * 1. Producer: Go through the collection and do things with each of them
	 * Collection<? extends Thing>
	 * 
	 * 2. Consumer: Add things to the collection Collection<? super Thing>
	 Comparables and comparators are consumers
	 
	 */

	//going through the collection
	public void pushAll(Iterable<? extends E> src) {
		for (E e : src) {
			push(e);
		}
	}

	//Adding to dst so consumer
	public void popAll(Collection<? super E> dst) {
		while (!isEmpty()) {
			dst.add(pop());
		}
	}
}
