package com.java.day14.ExceptionHandling;

public class Try_Catch_Block {

	public static void main(String[] args) {
		
		nullPointerExceptionValidation();
		
		validatingArithmeticException();
		tryCodeIsNotRiskySoWhatHappensToCatchBlock();
	}
	
	public static void nullPointerExceptionValidation() {
		String name = null;
		System.out.println(name.length());
	}
	
	
	public static void validatingArithmeticException() {
		int a=10, b=0, c;
		try {
			c=a/b;
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Hello World");
	}
	
	
	public static void tryCodeIsNotRiskySoWhatHappensToCatchBlock() {
		int a=10, b=2, c;
		try {
			c = a/b;
			System.out.println(c);
			System.out.println("I am inside Try Block Without Risky code");
		} catch (Exception e) {
			System.out.println("I am inside Catch Block");
			e.printStackTrace();
		}
	}
	
	//Explanation:
	//Exception occurs at row number 13 for the method validatingArithmeticException()
	//the method validatingArithmeticException() will create an Object to handle this exception
	//since it is not able to handle the exception it is passing the Object to the Compiler.
	//Is compiler able to handle this Exception?
	//Answer: NO
	
	//Compiler will transer this Exception Object to Default Exception Handler
	
	//What will DEH do ??
	//it will print the Exception and it will print the following
	//ExceptionName- ArithmeticException
	//Description - / by zero
	//stacktrace - it gives the whole area where exception is occuring

}
