package com.automation.TestNG.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_TN {
	public WebDriver driver;

	@Test(dataProvider = "getData")
	public void loginTNTest(String username, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = { { "seleniumpanda@gmail.com", "Selenium@123" },
				            { "seleniumpanda1@gmail.com", "Selenium@123" }, 
				            { "seleniumpanda2@gmail.com", "Selenium@123" },
				            { "seleniumpanda3@gmail.com", "Selenium@123" }, 
				            { "seleniumpanda4@gmail.com", "Selenium@123" } };

		return data;
	}
}
