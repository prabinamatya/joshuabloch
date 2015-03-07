package com.prabin.timer;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Intern {

	private static final ConcurrentMap<String, String> map = new ConcurrentHashMap<String, String>();
	
	public static String intern(String s) {
		String result = map.get(s);
		if(null == result) {
			result = map.putIfAbsent(s, s);
			if(null == result) {
				result = s;
			}
		}
		
		return result;
	}
}
