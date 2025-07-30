package com.prime.java.interfaces;
//intermediate btw implementaion class and main class
import java.util.Scanner;
//used to create obj
public class CarFactory {
public static Car carfactory(){
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the car name");
	 String car_name=sc.nextLine();
	 if(car_name.equals("BMW")) {  //car name equal to whch car we are taking then it] will create obj
           return new BMW();
	 }
	 else if(car_name.equals("Honda")) {
		 return new Honda();
	 }
	 else {
		 return null;
	 }
	 
	 
 }
}
