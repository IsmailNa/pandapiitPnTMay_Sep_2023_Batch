package com.java.day14_WrapperClasses;

public class Boxing_Unboxing {
	
	//Character and Boolean Wrapper Classes - immediate parent Class is Object
	//Integer, Short, Byte, Long, Double, Float - immediate parent Class is Number
	
	//Boxing - conversion of primitive data type to Wrapper Class Object
	
	//Unboxing - conversion of Wrapper Class Object to primitive data type

	public static void main(String[] args) {
		
		boxingConcept();
		autoBoxingConcept();
		unboxingConcept();
		autoUnboxingConcept();
	}
	
	public static void boxingConcept() {
		int a = 10;
		Integer b = Integer.valueOf(a);
		System.out.println("the converted int data type to Wrapper Class Object using boxing is :" + b);
	}
	
	public static void autoBoxingConcept() {
		int a = 10;
		Integer b = a;
		System.out.println("the converted int data type to Wrapper Class Object using autoboxing is :" + b);
		
	}
	
	public static void unboxingConcept() {
		Integer result = 200;
		int newResult = result.intValue();
		System.out.println("the converted  Wrapper Class Object to primitive data type using unboxing is :" + newResult);
	}
	
	public static void autoUnboxingConcept() {
		Integer result = 300;
		int newResult = result;
		System.out.println("the converted  Wrapper Class Object to primitive data type using autounboxing is :" + newResult);
	}

}
