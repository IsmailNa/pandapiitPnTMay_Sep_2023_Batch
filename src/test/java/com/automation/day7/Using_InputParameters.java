package com.automation.day7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_InputParameters {

	public WebDriver driver;
	
	public static void main(String[] args) {
		Using_InputParameters ui = new Using_InputParameters();
		ui.loginTest(ui.driver, "https://google.com", "Chrome");
	}
	

	public void loginTest(WebDriver driver, String url, String browserName) {
		this.driver = driver;
		url = "https://google.com";
		browserName = "Chrome";
		
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		
	}

}
