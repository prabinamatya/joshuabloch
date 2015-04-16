package com.prabin.interview;

import java.util.Arrays;

public class StringHasUniqueCharacters {
	//determine if the string has all unique characters
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
	
	//reverse string
	public String reverseString(String stringVal) {
		char[] charArray = stringVal.toCharArray();
		StringBuilder sb = new StringBuilder();
		int length = stringVal.length()-1;
		for(int i = length; i >= 0; i--) {
			sb.append(charArray[i]);
		}
		return String.valueOf(sb);
	}
	
	//check whether 2 strings are permutation of one another
	public boolean permutationString(String stringVal1, String stringVal2) {
		String stringVal1Copy = stringVal1;
		String stringVal2Copy = stringVal2;
		
		char[] charArrayStringVal1 = stringVal1Copy.toCharArray();
		char[] charArrayStringVal2 = stringVal2Copy.toCharArray();
		Arrays.sort(charArrayStringVal1);
		Arrays.sort(charArrayStringVal2);
		System.out.println(charArrayStringVal1);
		System.out.println(charArrayStringVal2);
		
		return (Arrays.equals(charArrayStringVal1, charArrayStringVal2));
	}

}
