package com.prabin.enumtypes;

public enum Planet {
	MERCURY(3.3, 2.4), VENUS(4.8, 6.05), EARTH(5.9, 6.3), MARS(6.4, 3.3), JUPITER(
			1.8, 7.14), SATURN(5.6, 6.0), URANUS(8.6, 2.5), NEPTUNE(1.02, 2.4);

	private final double mass;
	private final double radius;
	private final double surfaceGravity;

	private static final double G = 6.67300E-11;

	Planet(double mass, double radius) {
		this.mass = mass;
		this.radius = radius;
		surfaceGravity = G * mass / (radius * radius);
	}
	
	public double mass() {
		return mass;
	}
	
	public double radius() {
		return radius;
	}
	
	public double surfaceGravity() {
		return surfaceGravity;
	}
	
	public double surfaceWeight(double mass) {
		return mass * surfaceGravity;
	}

}
