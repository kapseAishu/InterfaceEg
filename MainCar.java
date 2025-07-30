package com.prime.java.interfaces;

public class MainCar {

	public static void main(String[] args) {
		Driver d=new Driver();
		Car c=CarFactory.carfactory();
		c.m2();
		d.drive(c);
		Car.m1();
	}

}
