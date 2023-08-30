package com.java.day14_ScannerClass;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		//Create the Object of Scanner Class
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name = scan.next();
		
		System.out.println("Gender ?");
		char gender = scan.next().charAt(0);
		
		System.out.println("Enter Age");
		int age = scan.nextInt();
		
		System.out.println("Enter phoneNumber");
		long phone = scan.nextLong();
		
		System.out.println("Name is: " + name);
		System.out.println("Gender is: " + gender);
		System.out.println("Age is:" + age);
		System.out.println("Phone Number is:" + phone);

	}

}
