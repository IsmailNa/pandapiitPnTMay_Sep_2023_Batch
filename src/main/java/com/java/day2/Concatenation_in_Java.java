package com.java.day2;

public class Concatenation_in_Java {
	//Concatenation means joining and it is represented by +
	//My name is : > Name
	//My language is : > English
	//My country is : Country1 Country2 Country3

	public static void main(String[] args) {
		String S1 = "My name is :";
		String S2 = "> Name";
		System.out.println(S1 + " "+  S2);
		
		//My country is : Country1 Country2 Country3
		
		String S3 = "My country is :";
		String S4 = "Country1";
		String S5 = "Country2";
		String S6 = "Country3";
		
		System.out.println(S3 + " " + S4+ " " + S5 + " "+ S6);
		
		
		//what if we try to concatenate different data types
		
		int i = 10;
		int j = 20;
		String S9 = "Hello";
		String S10 = "World";
		
		System.out.println(i+j+S9+S10);
		System.out.println(S9+S10+i+j);
		System.out.println(S9+S10+(i+j));
		
		
		

	}

}
