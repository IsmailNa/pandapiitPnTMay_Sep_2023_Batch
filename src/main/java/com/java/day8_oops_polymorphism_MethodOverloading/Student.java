package com.java.day8_oops_polymorphism_MethodOverloading;

public class Student {

	public static void main(String[] args) {
		main(10);
		main(args = new String[3], args = new String[4]);
		main("Hello");
	}
	
	public static void main(String[] args1, String[] args2) {
		System.out.println("this is main method with 2 String array parameters");
	}
	
	public static void main(int i) {
		System.out.println("This is overloaded main method with one int datatype parameter");
	}
	
	public static void main(String S1) {
		System.out.println("This is overloaded main method with one String datatype parameter");
	}

	public static void addition() {
		System.out.println("This is a normal static method");
	}

	// we have to overload this method addition

	public static void addition(int i) {
		System.out.println("Overloaded method with one int datatype parameter");
	}

	public static void addition(int i, int j, String S1) {
		System.out.println("Overloaded method with two int datatype parameter");
	}
	
	public static void addition(int i, String S1, int j) {
		System.out.println("Overloaded method with two int datatype parameter");
	}

	public static void addition(String S2) {

	}

	public static void addition(String S3, String S1) {

	}

}
