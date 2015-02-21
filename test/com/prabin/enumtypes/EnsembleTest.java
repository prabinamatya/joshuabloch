package com.prabin.enumtypes;

import org.junit.Test;

public class EnsembleTest {

	@Test
	public void test() {
		
		for(Ensemble val : Ensemble.values()) {
			System.out.println(val);
		}
	}

}
