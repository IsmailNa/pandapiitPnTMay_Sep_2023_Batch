package com.java.day7;

public class Student_Con {
	
	String name ;           //default value of a String is ???? null
    String subject_id ;        //null
	int student_id ;          //0 - default value of an int is 0

	public static void main(String[] args) {
	
		//Constructors are invoked the moment an Object is created
		
		Student_Con student1 = new Student_Con("Tom" , "Java", 101); //default constructor which is not visible
		System.out.println(student1.name + " " + student1.subject_id + " " + student1.student_id);
		
		Student_Con student2 = new Student_Con("Mark", "Python", 102);
		System.out.println(student2.name + " " + student2.subject_id + " " + student2.student_id);
		
		
		student2.name = "John";
		student2.subject_id = "C++";
		student2.student_id = 200;
		System.out.println(student2.name + " " + student2.subject_id + " " + student2.student_id );
		//Constructors are invoked the moment an Object is created

	}
	

	
	public Student_Con(String name, String subject_id, int student_id){ //with arguments user defined constructor
		this.name = name;
		this.subject_id = subject_id;
		this.student_id = student_id;
	}
	
	

}
