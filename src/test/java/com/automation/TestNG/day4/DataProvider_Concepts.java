package com.automation.TestNG.day4;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//Rules to use DataProvider
//1. @DataProvider returns a 2-Dimensional Object Array
//2. You have to pass no of rows and cols - you have to specify the data
//3. You have to use an annotation known as dataProvider inside the @Test case
//3.1 dataProvider annotation is not @DataProvider
//4. You have to paramterize the Test Case

public class DataProvider_Concepts {
	
	@Test(dataProvider = "getData")
	public void loginTest(String username, String password, long mobilenumber, String browser) {
		System.out.println(username + " " + password + " " + mobilenumber + " " + browser);
		
	}

	
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][4];
		
		data[0][0] = "username1";
		data[0][1] = "password1";
		data[0][2] = 987654321;
		data[0][3] = "Chrome";
		
		data[1][0] = "username2";
		data[1][1] = "password2";
		data[1][2] = 987654322;
		data[1][3] = "Firefox";
		
		data[2][0] = "username3";
		data[2][1] = "password3";
		data[2][2] = 987654323;
		data[2][3] = "Edge";
		
		return data;
	}
}
