package com.prabin.interview;

public class StringStartsWithUppercase {

	public boolean startsWithUpperCase(String val) {
		int ascii = (int) val.charAt(0);
		if(ascii >=65 && ascii <= 90) {
			return true;
		}
		return false;
	}
}
