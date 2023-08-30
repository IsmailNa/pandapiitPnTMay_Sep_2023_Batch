package com.java.day14.ExceptionHandling;

public class PrintStackTraceInformation {

	public static void main(String[] args) {
		int a=10, b=0, c;
		try {
			c=a/b;
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
		   //System.out.println(e); //this will print nameofException and Descrption but not stack trace
		//	System.out.println(e.toString());//this will print nameofException and Descrption but not stack trace
			//System.out.println(e.getMessage()); //only description
		}

	}

}
