package com.java.day8_oops_polymorphism_MethodOverRiding;

public class Student extends School {

	public static void main(String[] args) {
		Student student = new Student();
		student.library();
		student.library("Hitachi");
		student.library("Bluestar", true);
		
		School school = new School();
		school.library();
		school.library("Carrier");
		school.library("SAMSUNG", false);

	}
	
	
	public void library() {
		System.out.println("Student's library");
	}
	
	public void library(String AC) {
		System.out.println("Students's library with AC");
	}
	
	public void library(String AC, boolean examResult) {
		System.out.println("Student's library with AC as well as exam Center");
	}

}
