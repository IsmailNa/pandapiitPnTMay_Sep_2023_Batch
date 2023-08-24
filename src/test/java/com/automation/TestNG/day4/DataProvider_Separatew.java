package com.automation.TestNG.day4;

import org.testng.annotations.DataProvider;

public class DataProvider_Separatew {
	
	@DataProvider
	public Object[][] getTNData() {
		Object[][] data = {{"seleniumpanda@gmail.com", "Selenium@123" },
				           {"seleniumpanda1@gmail.com", "Selenium@123" }};
		return data;
	}
	
	
	@DataProvider
	public Object[][] getRediffData() {
		Object[][] data = {{"seleniumpanda@rediffmail.com", "Selenium@123" },
		           {"seleniumpanda1@rediffmail.com", "Donkey@123" }};
       return data;
	}

}
