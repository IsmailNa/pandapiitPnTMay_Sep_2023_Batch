package com.java.day4;

public class One_Dimensional_Array {

	// [] is one dimension
	// [][] is 2 dimension

	// 1. Declaration of Array
	// 2. Create an Array
	// 3. Initialize an Array
	// 4. Retrieve the elements of Array

	public static void main(String[] args) {

		// 1. Declaration of Array

		//int[] a; // a is 1-D int array
		int a1[]; // this is the 2nd most popular way of declaring an array
		int[] a2;
		int[] a3;

		int[] b, c; // b is 1-D and c is 1-D array
		int b1[], c1; // b1 is 1-D and c1 is just a simple int variable
		int[] b2, c2; // b2 and c2 are both 1-D arrays

		// 2. Creating an Array

		//a = new int[3];
		// length of this integer array a
		//System.out.println("The length of this array is : " + a.length);

		//3 . Initialize an array
		
		int[] a = new int[5];
		System.out.println("The length of this array is : " + a.length);
		//indexing position begins with 0
		//indexing positions for a will be - 0, 1, 2, 3, 4
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		//Combine declaration + Creation + Initialization together in one statement
		
		// int[] a = {10, 20, 30, 40, 50};
		//int[] a = new int[] {10, 20, 30, 40, 50};

	}

}
