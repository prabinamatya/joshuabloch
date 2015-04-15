package com.prabin.interview;

public class NearestToHundred {
	public int nearestToHundred(int a , int b) {
		if(Math.abs(100-a) < (Math.abs(100-b))) {
			return a;
		}
		return b;
	}
}
