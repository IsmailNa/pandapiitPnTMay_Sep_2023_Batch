package com.java.day8_oops_polymorphism_MethodOverRiding;

public class School {
	
	protected void library() {
		System.out.println("School's library");
	}
	
	public void library(String AC) {
		System.out.println("School's library with AC");
	}
	
	public void library(String AC, boolean examResult) {
		System.out.println("School's library with AC as well as exam Center");
	}

}
