package com.automation.TestNG.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TN_Register_All_Warnings_Assertions {
	
	public WebDriver driver;
	
	@Test
	public void registerTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		String actualPrivacyPolicyWarning = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
		String expectedPrivacyPolicyWarning = "Warning: You must agree to the Privacy Policy!";
		
		//Assert.assertEquals(actualPrivacyPolicyWarning, expectedPrivacyPolicyWarning);
		Assert.assertTrue(actualPrivacyPolicyWarning.contains(expectedPrivacyPolicyWarning));
		
		
		
		
	}

}
