package com.automation.TestNG.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RediffParameterization {
	public WebDriver driver;

	@Test
	@Parameters({ "browser", "url", "username", "password" })
	public void rediffTest(String browserName, String urlName, String userName, String passwordName) {

		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.get(urlName);
		driver.findElement(By.id("login1")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(passwordName);
		driver.findElement(By.className("signinbtn")).click();
		driver.quit();

	}

}
