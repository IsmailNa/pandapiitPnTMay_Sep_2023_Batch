package com.java.day6;

public class Class_Assignment_Classes_Methods {

	// Create a Class which has the main method
	// Inside this class create public, private, protected, default static and
	// non-static methods
	// static methods created will be called directly
	// non static methods created will be called by the help of Object reference
	// make sure the methods have a proper return type. Do not keep void as return type for all the methods
	// Create another class
	// in this class again create 5 methods, 3 non static and 2 static and do not
	// create main method in this class
	// so now you have to call all these static and non-static methods inside the
	// main method of the Class which
	// you created

	public static void main(String[] args) {
		TC1();
		TC2();
		TC3();
		TC4();

		Class_Assignment_Classes_Methods ref = new Class_Assignment_Classes_Methods();
		ref.TC5();
		
		New_Class ref1 = new New_Class();
		
		New_Class.logic1();
		New_Class.logic2();
		ref1.logic3();
		ref1.logic4();
		ref1.logic5();
		
	}

	public static int TC1() {
		int i = 1, j = 3;
		int k = i + j;
		System.out.println(k);
		return k;
	}

	private static String TC2() {
		String S1 = "Hello";
		String S2 = "World";
		String S3 = S1 + S2;
		System.out.println(S3);
		return S3;
	}

	protected static boolean TC3() {
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = (b1 != b2);
		System.out.println(b3);
		return b3;
	}

	static void TC4() {
		System.out.println("This is a default static method");
	}

	public void TC5() {
		System.out.println("This is non-static public method");
	}

}
