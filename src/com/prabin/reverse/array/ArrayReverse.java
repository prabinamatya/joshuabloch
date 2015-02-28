package com.prabin.reverse.array;

public class ArrayReverse {
	
	public int [] reversal(int [] arrayPass) {
		int len = arrayPass.length;
		int temp;
		for(int i = 0; i < arrayPass.length /2; i++) {
			temp = arrayPass[len-i-1];
			arrayPass[len-i-1] = arrayPass[i];
			arrayPass[i] = temp; 
		}
		System.out.println(arrayPass);
		return arrayPass;
	}

}
