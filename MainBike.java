package com.prime.java.interfaces;

public class MainBike {

	public static void main(String[] args) {
		BikeDriver b1=new BikeDriver();
		Bike Bb=BikeFactory.bikefactory();
		b1.drive(Bb);

	}

}
