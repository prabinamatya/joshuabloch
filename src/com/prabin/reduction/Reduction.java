package com.prabin.reduction;

import java.util.ArrayList;
import java.util.List;

public class Reduction {
	static <E> E reduce(List<E> list, Function<E> f, E initVal) {
		List<E> snapshot;
		synchronized (list) {
			snapshot = new ArrayList<E>(list);
		}
		E result = initVal;
		for (E e : snapshot) {
			result = f.apply(result, e);
		}
		return result;
	}

	static final Function<Integer> SUM = new Function<Integer>() {
		public Integer apply(Integer i1, Integer i2) {
			return i1 + i2;
		}
	};

	static final Function<Integer> PRODUCT = new Function<Integer>() {
		public Integer apply(Integer i1, Integer i2) {
			return i1 * i2;
		}
	};

}
