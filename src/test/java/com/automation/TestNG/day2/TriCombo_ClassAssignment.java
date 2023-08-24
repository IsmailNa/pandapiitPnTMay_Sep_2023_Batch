package com.automation.TestNG.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TriCombo_ClassAssignment {

	// @Test - clickOnSignInLink
	// @Test - Login
	// @Test - Logout

	public WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
	}

	@Test(priority = 1)
	public void clickOnSignInLink() {
		driver.findElement(By.className("signin")).click();
	}
	
	@Test(priority=2)
	public void login() {
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
		
	}
	
	@Test(priority=3)
	public void logout() throws Exception {
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("rd_logout")).click();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
