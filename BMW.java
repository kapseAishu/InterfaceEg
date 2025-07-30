package com.prime.java.interfaces;

public class BMW implements Car{

	@Override
	public void accelerator() {
		System.out.println("press the accelerator to increase the speed");
		
	}

	@Override
	public void gear() {
		System.out.println("Press clutch and move gear to start ");
		
	}

	@Override
	public void clutch() {
		System.out.println("Press clutch and move break to stop");
		
	}

}
