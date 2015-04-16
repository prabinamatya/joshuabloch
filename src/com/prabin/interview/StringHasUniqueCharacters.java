package com.prabin.interview;

import java.util.Arrays;

//determine if the string has all unique characters
public class StringHasUniqueCharacters {
	public boolean hasUnique(String stringVal) {
		String workingString = stringVal;
		char[] charArray = workingString.toCharArray();
		Arrays.sort(charArray);
		
		int length = charArray.length -1;
		for(int i = 0, j = i+1; i < length; i++,j++) {
			if(charArray[i] == charArray[j]) {
				return false;
			}
		}
		return true;
	}
	
	public String reverseString(String stringVal) {
		char[] charArray = stringVal.toCharArray();
		StringBuilder sb = new StringBuilder();
		int length = stringVal.length()-1;
		for(int i = length; i >= 0; i--) {
			sb.append(charArray[i]);
		}
		return String.valueOf(sb);
	}

}
