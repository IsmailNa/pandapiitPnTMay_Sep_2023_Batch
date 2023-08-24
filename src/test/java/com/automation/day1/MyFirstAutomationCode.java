package com.automation.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstAutomationCode {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();	 //Ctrl+Shift+O
	driver.manage().window().maximize();
	driver.get("https://www.costco.com");
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://flipkart.com");
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://tutorialsninja.com/demo");

	}

}
