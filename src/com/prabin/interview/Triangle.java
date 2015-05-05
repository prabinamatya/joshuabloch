package com.prabin.interview;

import java.util.ArrayList;
import java.util.List;

public class Triangle {

	public void printTriangle(char[] val) {
		for(int i = 1; i < val.length; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(val[j]);
			}
			System.out.println();
		}
	}
	
	public String[] combine(int[] a, String[] b) {
		int lengthOfFinalArray = a.length + b.length;
		String[] combine = new String[lengthOfFinalArray];
		
		for(int i=0, j=0; j<lengthOfFinalArray && i < a.length; i++, j++) {
			combine[j] = String.valueOf(a[i]);
			combine[++j] = b[i];
			
		}
		return combine;
	}
}
