package com.prabin.concrete.on.skeletal;

import java.util.AbstractList;
import java.util.List;

public class IntArrays {
	static List<Integer> intArraysAsList(final int[] a) {
		if (a == null) {
			throw new NullPointerException();
		}
		return new AbstractList<Integer>() {
			public Integer get(int i) {
				return a[i]; // Autoboxing
			}

			public Integer set(int i, Integer val) {
				int oldVal = a[i];
				a[i] = val; // Auto-unboxing
				return oldVal; // Autoboxing
			}

			@Override
			public int size() {
				return a.length;
			}
		};
	}

}
