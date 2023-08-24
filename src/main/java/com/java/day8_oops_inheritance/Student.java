package com.java.day8_oops_inheritance;

public class Student extends School {

	// Student becomes the child class or sub class
	// School becomes the parent class or super class

	String name;
	int grade_level;

	public static void main(String[] args) {
		Student student = new Student();
		student.playground();
		student.library();
		
		School school = new School();
		school.playground();
		school.library();
		
		
		student.subjectSelection();
		student.examAppearance();
		
		School.musical();
		markSheet();
		Student.markSheet();
		
	}

	public void subjectSelection() {
		System.out.println("Student's subject selection method");
	}

	public void examAppearance() {
		System.out.println("Student's exam appearance method");
	}
	
	public static void markSheet() {
		System.out.println("Student's marksheet");
	}

}
