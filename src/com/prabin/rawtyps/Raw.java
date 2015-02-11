package com.prabin.rawtyps;

import java.util.List;
import java.util.Set;

public class Raw {

	// Uses raw type of List so fails at runtime
	public static void unsafeAdd(List list, Object o) {
		list.add(o);
	}

	// Use of raw type for unknown element type - Don't do this
	static int rawNumElementsInCommon(Set s1, Set s2) {
		int result = 0;
		for (Object o1 : s1) {
			if (s2.contains(o1)) {
				result++;
			}
		}
		return result;
	}

	static int numElementsInCommon(Set<?> s1, Set<?> s2) {
		int result = 0;
		for (Object o1 : s1) {
			if (s2.contains(o1)) {
				result++;
			}
		}
		return result;
	}
}
