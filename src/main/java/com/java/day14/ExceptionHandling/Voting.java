package com.java.day14.ExceptionHandling;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter age");

		try {
			int age = scan.nextInt();
			if (age < 18) {
				// System.out.println("Not eligible for voting");
				throw new People("Not eligible for voting");
			} else {
				System.out.println("Eligible for voting");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Hello Voting World");
	}

}
