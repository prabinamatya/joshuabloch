package com.prabin.enumtypes;

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
	
}
