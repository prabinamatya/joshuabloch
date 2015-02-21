package com.prabin.enumtypes;

import java.util.HashMap;
import java.util.Map;

public enum Operation {
	PLUS("+") {
		@Override
		double apply(double x, double y) {
			return x+y;
		}
	},
	MINUS("-") {
		@Override
		double apply(double x, double y) {
			return x-y;
		}
	},
	MULTIPLY("*") {
		@Override
		double apply(double x, double y) {
			return x*y;
		}
	},
	DIVIDE("/") {
		@Override
		double apply(double x, double y) {
			return x/y;
		}
	};
	
	
	private final String symbol;
	
	Operation(String symbol) {
		this.symbol = symbol;
	}
	
	abstract double apply(double x, double y);
	
	private static final Map<String, Operation> stringToEnum = new HashMap<>();
	static {
		for(Operation op : values()) {
			stringToEnum.put(op.toString(), op);
		}
	}
	
	public static Operation fromString(String symbol) {
		return stringToEnum.get(symbol);
	}
	
}
