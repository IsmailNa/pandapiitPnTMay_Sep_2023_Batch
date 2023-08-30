package com.java.day14.ExceptionHandling;

public class Finally_Block {

	public static void main(String[] args) {
		int a=10, b=0, c;
		try {
			c=a/b;
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("This will print no matter what is happening in try or catch");
		}

	}

}
