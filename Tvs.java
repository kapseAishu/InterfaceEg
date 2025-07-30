package com.prime.java.interfaces;

public class Tvs implements Bike{

	@Override
	public void start() {
		System.out.println("used to start bike");
	}

	@Override
	public void stop() {
		System.out.println("used to stop bike");	
	}

	@Override
	public void accelerate() {
		System.out.println("Accelerating to 50 km/h");
	}

}
