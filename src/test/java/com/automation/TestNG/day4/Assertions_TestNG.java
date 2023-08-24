package com.automation.TestNG.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assertions_TestNG {
	
	//There are 2 types of Assertions in TestNG
	
	//1. Assert
	//2. SoftAssert
	
	//Assert.assertTrue
	//Assert.assertFalse
	//Assert.assertEquals
	//Assert.assertNotEquals
	//Assert.fail
	
	public WebDriver driver;
	
	@BeforeMethod
	public void launchUrl() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
	}
	
	@Test(priority=1)
	public void loginLogic() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		WebElement editAccountInfoLink = driver.findElement(By.linkText("Edit your account information"));
		Assert.assertFalse(editAccountInfoLink.isDisplayed(), "I have done something wrong and the link is not getting displayed");
		System.out.println(1 + 2);
		
	}
	
	@Test(priority = 2)
	public void negativeLogin() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@1234567");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
		String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password....";
		
		Assert.assertEquals(actualWarningMessage, expectedWarningMessage, "I am deliberately failing this");
		System.out.println("My assertion for wrong login is correct");
		
		
		
	}
	
	@Test(priority=2, enabled = false)
	public void logoutLogic() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		WebElement logoutLink = driver.findElement(By.linkText("Logout"));
		
		//Assert.assertTrue(logoutLink.isDisplayed());
		Assert.fail("Deliberately failing");
		System.out.println(driver.getTitle());
		logoutLink.click();
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}

}
