package com.java.day14_ScannerClass;

import java.util.Scanner;

public class CalculatorDemo {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter the first number");
	int num1 = scan.nextInt();
	
	System.out.println("Enter the second number");
	int num2 = scan.nextInt();
	
	System.out.println("Select Operation (+, - , *, /)");
	String symbol = scan.next();
	
	int res;
	
	switch(symbol) {
	case "+" : res = num1 + num2;
	System.out.println("The result is: " + res);
	break;
	
	case "-" : res = num1 - num2;
	System.out.println("The result is: " + res);
	break;
	
	case "*" : res = num1 * num2;
	System.out.println("The result is: " + res);
	break;
	
	case "/" : res = num1 / num2;
	System.out.println("The result is: " + res);
	break;
	
	default: System.out.println("invalid symbol for operation");
	break;
	
	}

	}

}
