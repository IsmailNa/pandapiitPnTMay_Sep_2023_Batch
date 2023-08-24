package com.java.day5.revision;

public class Concept1 {

	// What is a method in java ?

	// Methods are independent units of Execution
	// They will have a definitive logic inside of it which under certain conditions
	// will be used
	// Why is main method always static ??
	
	public static void main(String[] args) {
		System.out.println("This is the main method");
		
		subtraction();
		
		addition();

	}

	public static void addition() {
		int i = 2, j = 4;
		System.out.println(i + j);

	}

	public static void subtraction() {
		int j = 10, k = 6;
		System.out.println(j - k);

	}

	

}
