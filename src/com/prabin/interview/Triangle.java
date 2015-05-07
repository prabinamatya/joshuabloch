package com.prabin.interview;

public class Triangle {

	public void printTriangle(char[] val) {
		for (int i = 1; i < val.length; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(val[j]);
			}
			System.out.println();
		}
	}

	public String[] combine(int[] a, String[] b) {
		int lengthOfFinalArray = a.length + b.length;
		String[] combine = new String[lengthOfFinalArray];

		for (int i = 0, j = 0; j < lengthOfFinalArray && i < a.length; i++, j++) {
			combine[j] = String.valueOf(a[i]);
			combine[++j] = b[i];

		}
		return combine;
	}

	public int biggestNumber(int... a) {
		 int[] sortedArray = sortedBySize(a);
		 StringBuilder sb = new StringBuilder();
		 for(int val : sortedArray) {
			 sb.append(val);
		 }
		 return Integer.valueOf(sb.toString());
	}

	public int[] sortedBySize(int... a) {
		int temp;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 1; j < a.length-i; j++) {

				if (firstDigit(a[j]) > firstDigit(a[j - 1])) {
					temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(a);
		return a;
	}

	private int firstDigit(int num) {
		if (num < 10) {
			return num;
		}
		int i = num / 10;
		return i;
	}
}
