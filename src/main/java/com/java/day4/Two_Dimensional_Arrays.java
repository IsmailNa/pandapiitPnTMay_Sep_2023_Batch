package com.java.day4;

public class Two_Dimensional_Arrays {
	// [][]

	public static void main(String[] args) {
		// 1. Declaration of Array
		
		//int[][] a;
		int a1[][];
		int [][]a2;
		int[]a3[];
		int[][]a4;
		
		int[][] b,c; //b and c are both 2-D arrays
		int[] b1[], c1; //b1 is 2-D, c1 is 1-D
		int[] b2[], c2[]; //b2 and c1 are both 2-D
		//int[][]b3, []c3; //law of arrays in java - 2nd variable cannot have a dimension before it. Only after is allowed
		int[][]b3, c3[]; //b3 is 2-D, c3 is 3-D
		int[]b4[], c4[]; //b4 and c4 are both 2-D
		
		
		
		
		// 2. Create an Array
		
		//a = new int[3][4]; //3X4 matrix - 3 is number of rows, 4 is number of cols
		// 3. Initialize an Array
		// 4. Retrieve the elements of Array
		
		/*
		 * a[0][0] = 1; a[0][1] = 2; a[0][2] = 3; a[0][3] = 4;
		 * 
		 * a[1][0] = 5; a[1][1] = 6; a[1][2] = 7; a[1][3] = 8;
		 * 
		 * a[2][0] = 9; a[2][1] = 10; a[2][2] = 11; a[2][3] = 12;
		 */
		
	       //  System.out.println(a.length);
		
		//declare + create + initialize 2-d Array in one statement
		
		int[][] a = { {1,2,3,4,11}, {5,6,7,8,22}, {9,10,11,12,33}, {13,14,5,16,44} };
		
		//retrieve all the elements of this 2-D array
		
		for(int i=0 ; i<a.length; i++) {
			for(int j=0 ; j<a[i].length ; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

}
