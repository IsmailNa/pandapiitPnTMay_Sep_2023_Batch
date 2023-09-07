package com.java.Collection_Framework;

import java.util.ArrayList;

public class Video2_Arrays_Vs_Collections {

	public static void main(String[] args) {
	//1. Arrays can store both primitive and non-primitive data types
		
		int[] a = {1,2,3,4};
		
		Video2_Arrays_Vs_Collections obj1 = new Video2_Arrays_Vs_Collections();
		Video2_Arrays_Vs_Collections obj2 = new Video2_Arrays_Vs_Collections();
		Video2_Arrays_Vs_Collections obj3 = new Video2_Arrays_Vs_Collections();
		Video2_Arrays_Vs_Collections obj4 = new Video2_Arrays_Vs_Collections();
		
		
		Video2_Arrays_Vs_Collections[] ref = {obj1, obj2, obj3, obj4};
		
	//1. Collection framework can only store non-primitive data type. It cannot store primitive data type.
		ArrayList al = new ArrayList();
		al.add(obj1);
		al.add(10); //this is an Integer Wrapper Class Object
		
	
		//2. Arrays can store only homogeneous type of data excepting in some cases of int
		
		int[] b = {1, 2, 3, 'c', 4, 5};
		
		//2. Collection framework can store heterogeneous type of data
		
		
		//3. Array size is fixed, i.e., during runtime we cannot increase/decrease the size of an Array
		//3. We can increase/decrease size of Collections during runtime
		
		//4. Arrays are inbuilt features of java, so algorithms have to developed by the programmer
		//4. Collection framework - it is a pre-defined API which provides pre-defined Interfaces and Classes and methods. So we can use it directly
		

	}

}
