package com.automation.TestNG.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//you have to create the Object of SoftAssert Class

public class SoftAssert_Concept {

	public WebDriver driver;
	public SoftAssert softassert = new SoftAssert();

	@BeforeMethod
	public void launchUrl() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");

	}

	@Test(priority = 1)
	public void loginLogic() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		WebElement editAccountInfoLink = driver.findElement(By.linkText("Edit your account information"));
        softassert.assertFalse(editAccountInfoLink.isDisplayed());
		
        System.out.println(1 + 2);
       softassert.assertAll();

	}

	@Test(priority = 2)
	public void negativeLogin() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@1234567");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

		String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]"))
				.getText();
		String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";

		System.out.println("My assertion for wrong login is correct");

	}

	@Test(priority = 2, enabled = false)
	public void logoutLogic() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		WebElement logoutLink = driver.findElement(By.linkText("Logout"));

		System.out.println(driver.getTitle());
		logoutLink.click();

	}

	@AfterMethod
	public void tearDown() {

		driver.quit();
	}

}
