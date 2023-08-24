package com.testNG.Assignment_16th_Aug_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TNLoginParaTest {
	
	public WebDriver driver;
	
	@Test
	@Parameters({ "browser", "url", "username", "password" })
	public void tnTest(String browserName, String urlName, String userName, String passwordName) {

		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.get(urlName);
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(userName);
		driver.findElement(By.id("input-password")).sendKeys(passwordName);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		//driver.quit();

	}

}
