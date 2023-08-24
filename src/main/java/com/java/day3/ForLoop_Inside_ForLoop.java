package com.java.day3;

public class ForLoop_Inside_ForLoop {

	public static void main(String[] args) {

    for(int i=1 ; i<=3 ; i++) { //this is the outer for loop
    	
    	for (int j=1 ; j <=5 ; j++) { //this is the inner for loop
    		System.out.println("Green");
    	}
    	
    	System.out.println("World");
    }

	}

}
