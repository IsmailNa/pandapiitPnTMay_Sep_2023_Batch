package com.java.day14.ExceptionHandling;

public class Part1_Throw {

	public static void main(String[] args) {
		int a = 10, b = 0, c;
		c = a / b;
		System.out.println(c);
		throw new ArithmeticException();
		
		//it is a good practice to not use pre-defined Exceptions with throw keyword
		
		
		
	}

}
