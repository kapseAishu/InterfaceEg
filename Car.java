package com.prime.java.interfaces;

public interface Car {
//3 methods
void accelerator();
void gear();
void clutch();
public static void m1(){
	System.out.println("this is static method of interface");   
// java 8 feature ,static and default methods we hv to give implementation here it self we cannot change it.
}
default void m2() {
	System.out.println("this is default method of interface");
}

}
