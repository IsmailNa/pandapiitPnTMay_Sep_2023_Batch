package com.java.day7;

public class Dog {
	String name;
	String color;
	int age;

	public static void main(String[] args) {
		Dog Labrador = new Dog();
		System.out.println(Labrador.name = "Romeo");
		System.out.println(Labrador.color = "Fawn");
		System.out.println(Labrador.age = 10);
		
		Labrador.initializeLabProfile("Romeo", "Fawn", 10);
		Labrador.displayLabProfile();

	}
	
	public void initializeLabProfile(String n, String c, int a) {
		name = n;
		color = c;
		age = a;
	}
	
	public void displayLabProfile() {
		System.out.println(name + " " + color + " " + age);
	}

}
