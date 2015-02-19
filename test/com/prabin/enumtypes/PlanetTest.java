package com.prabin.enumtypes;

import org.junit.Test;

public class PlanetTest {

	@Test
	public void test() {
		double earthWeight = 2.05d;
		double mass = earthWeight / Planet.EARTH.surfaceGravity();
		for(Planet p : Planet.values()) {
			System.out.println("Planet = " +  p  + " weight" + p.surfaceWeight(mass));
		}
	}

}
