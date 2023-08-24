package com.automation.ApplyingDataDriven_this_Super_keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchProductTest extends TestBase{
	
public SearchProductTest() throws Exception {
		super();
		
	}

public WebDriver driver;
	
	@BeforeMethod
	public void setup() {
	
		
	}
	
	@Test(priority=1)
	public void verifySearchWithValidProduct() {
		driver.findElement(By.xpath("//input[@name = 'search']")).sendKeys("HP");
		driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();
		Assert.assertTrue(driver.findElement(By.linkText("HP LP3065")).isDisplayed());
		
	}
	
	@Test(priority=2)
	public void verifySearchWithInvalidProduct() {
		driver.findElement(By.xpath("//input[@name = 'search']")).sendKeys("DELL");
		driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//p[contains(text(), 'There is no product that matches the search criteria.')]")).isDisplayed());
		
	}
	
	@Test(priority=3)
	public void verifySearchWithNoProduct() {
		driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//p[contains(text(), 'There is no product that matches the search criteria.')]")).isDisplayed());
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
