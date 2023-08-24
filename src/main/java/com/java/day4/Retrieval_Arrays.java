package com.java.day4;

public class Retrieval_Arrays {

	public static void main(String[] args) {
		int[] a = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		System.out.println("Length is : " + a.length);
		//retrieve all the elements of this array
		
		for(int i=0 ; i<a.length ; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		
		//retrieve a specific element ?
		//9th element
		
		System.out.println("The 9th element of this array is : " + a[8]);
		

	}

}
