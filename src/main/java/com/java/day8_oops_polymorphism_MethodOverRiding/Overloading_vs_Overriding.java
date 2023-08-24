package com.java.day8_oops_polymorphism_MethodOverRiding;

public class Overloading_vs_Overriding {
	        //Poly means many
			//Morphism means forms
			
			//Types of Polymorphism: -
			
			//1. CompileTime Polymorphism / Static Polymorphism
			
			//How to achieve ?
			//By Method Overloading
			      // Method name should be same.
			      // Class should be same
			      // Parameters/Arguments should be different
			
			
			//Interview Question - Can I overload the main method ?? YES
			
			//Interview Question - Can we achieve method overloading if we change return type of methods ? NO
			
	
	
	//2. Run Time Polymorphism / Dynamic Polymorphism
	
		//How to achive this ?
		//Method overriding
		           //Method name should be same
		           //Class should be different
		           //Arguments will be same
		           //Inheritance has to be there (is-a) relationship
		
		//Interview question
		// Access modifier of over-ridden method of the Child class should be 
		//equivalent or higher than the method of the Parent Class

}
