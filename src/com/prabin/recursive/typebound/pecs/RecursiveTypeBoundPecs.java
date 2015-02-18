package com.prabin.recursive.typebound.pecs;

import java.util.Iterator;
import java.util.List;

public class RecursiveTypeBoundPecs {
	public static <T extends Comparable<? super T>> T max(List<? extends T> list) {
		Iterator<? extends T> iterator = list.iterator();
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
