package com.prabin.recursive.typebound;

import java.util.Iterator;
import java.util.List;

public class RecursiveTypeBound {
	public static <T extends Comparable<T>> T max(List<T> list) {
		Iterator<T> iterator = list.iterator();
		T result = iterator.next();
		while(iterator.hasNext()) {
			T next = iterator.next();
			if(next.compareTo(result) > 0) {
				result = next;
			}
		}
		return result;
	}
}
