package com.java.day6;

public class Concept_Of_Methods {

	//Methods - are independent units of execution
	//if the method is static then it can itself directly within the main method
	//if the method is static then it can be called by the Classname
	
	public static void main(String[] args) {
		addition();
		stringJoining();
		logic();
		test();
		
		Methods_In_SeparateClass.testCase1();
		Methods_In_SeparateClass.testCase2();
		
		//first you have to create the Object of the Class
		//then with the help of the reference of the Object you can call the non-static entities
		
		//How to create Objects?
		//1. new keyword
		//2. newInstance() method
		//3. clone() method
		//4. deserialization
		//5. factory methods
		
		Concept_Of_Methods reference = new Concept_Of_Methods(); 
		reference.loginTest();
		
		Methods_In_SeparateClass reference1 = new Methods_In_SeparateClass();
		reference1.testCase3();
		
	}
	
	public static int addition() {
		int i = 10;
		int j  = 20;
		int sum = i+j;
		System.out.println(sum);
		return sum;
		
	}
	
	private static String stringJoining() {
		String S1 = "Hello";
		String S2 = "World";
		String S3 = S1 + S2;
		System.out.println(S3);
		return S3;
		
	}
	
	protected static void logic() {
		System.out.println("this is a static protected logic method");
	}
	
	static void test() {
		System.out.println("This is a static default test method");
	}
	 
	 public void loginTest() {
		 System.out.println("this is a non-static public loginTest method");
	 }

}
