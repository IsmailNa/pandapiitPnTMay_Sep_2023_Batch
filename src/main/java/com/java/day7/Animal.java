package com.java.day7;

public class Animal {
	
	String name;
	int no_of_legs;
	int age;

	public static void main(String[] args) {
		Animal animal = new Animal();
		Animal animal1 = new Animal();
		Animal animal2 = new Animal();
		Animal animal3 = new Animal();
		Animal animal4 = new Animal();
		
		
		//animal is the reference
		
		//Object is collection of all the non-static entities of the Class
		animal.sleeping();
		
		animal.name = "Johnnie";
		animal.no_of_legs = 4;
		animal.age = 4;
		
		animal1.name = "Tommy";
		animal1.no_of_legs = 4;
		animal1.age = 4;
	}
	
	public void sleeping() {
		
	}
	
	

}
