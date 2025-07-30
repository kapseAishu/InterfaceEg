package com.prime.java.interfaces;

import java.util.Scanner;

public class BikeFactory {
	public static Bike bikefactory(){
		 Scanner sc=new Scanner(System.in);
		 String bike_name=sc.nextLine();
		 System.out.println("Enter the bike name");
		 if(bike_name.equals("Tvs")) { 
	           return new Tvs();
		 } 
		 else {
			 return null;
		 }
	}
}
