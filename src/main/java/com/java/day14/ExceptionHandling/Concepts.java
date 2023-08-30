package com.java.day14.ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Concepts {
	
	//There are 2 types of Exception in Java
	//1. CompileTime Exception [Checked Exception]
	//2. RunTime Exception [Unchecked Exception]

	public static void main(String[] args) {
		
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println(7/0); //this is an Exception. Cannot divide by Zero.
		System.out.println("8");
		System.out.println("9");
		System.out.println("10");

	}
	
	public static void validatingCompileTimeException() {
		
		try {
			FileInputStream ip = new FileInputStream("C:\\Users\\sarth\\OneDrive\\Desktop\\Framework.xlsx");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
