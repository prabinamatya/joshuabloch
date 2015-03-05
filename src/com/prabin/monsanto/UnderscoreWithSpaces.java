package com.prabin.monsanto;

import org.apache.commons.lang.StringUtils;

public class UnderscoreWithSpaces {

	public String sanitizedString(String inputVal) {

		String[] arraySplit = splitString(inputVal);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arraySplit.length; i++) {
			if(i == 0) {
				sb.append(StringUtils.capitalize(arraySplit[0]));
			} else {
				sb.append(" ");
				sb.append(arraySplit[i]);
			}
		}

		return String.valueOf(sb);
	}

	private String[] splitString(String inputVal) {
		return StringUtils.split(inputVal, "_");
	}

}
