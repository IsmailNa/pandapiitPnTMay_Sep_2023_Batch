package com.java.day14.ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws_Keyword {

	public static void main(String[] args) {
		validateWrongLogic();
		try {
			fileNotFoundValidation();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	public static void validateWrongLogic() {
		int a=10, b=0, c;
		try {
			c=a/b;
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void fileNotFoundValidation() throws Exception {
		FileInputStream ip = new FileInputStream("Desktop//abc.txt");
	}

}
