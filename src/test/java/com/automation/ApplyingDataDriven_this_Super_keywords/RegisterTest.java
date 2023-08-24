package com.automation.ApplyingDataDriven_this_Super_keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {

	public WebDriver driver;

	public RegisterTest() throws Exception {
		super();

	}

	@BeforeMethod
	public void setup() {
		driver = initializeBrowserAndOpenApplication("chrome");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
	}

	@Test(priority = 1, invocationCount = 5)
	public void registerAccountWithAllDetails() {
		driver.findElement(By.xpath("//input[@id = 'input-firstname']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@id = 'input-lastname']")).sendKeys("Panda");
		driver.findElement(By.xpath("//input[@id = 'input-email']")).sendKeys(Utilities.generateEmailWithTimeStamp());
		driver.findElement(By.xpath("//input[@id = 'input-telephone']")).sendKeys("987654321");
		driver.findElement(By.xpath("//input[@id = 'input-password']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@id = 'input-confirm']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@name = 'agree']")).click();
		driver.findElement(By.xpath("//input[@class = 'btn btn-primary']")).click();

	}

	@Test(priority = 2)
	public void registerAccountWithMandatoryDetails() {
		driver.findElement(By.xpath("//input[@id = 'input-firstname']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@id = 'input-lastname']")).sendKeys("Panda");
		driver.findElement(By.xpath("//input[@id = 'input-email']")).sendKeys("seleniumpanda090987@gmail.com");
		driver.findElement(By.xpath("//input[@id = 'input-telephone']")).sendKeys("987654321");
		driver.findElement(By.xpath("//input[@id = 'input-password']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@id = 'input-confirm']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@name = 'newsletter' and @value = '1']")).click();
		driver.findElement(By.xpath("//input[@name = 'agree']")).click();
		driver.findElement(By.xpath("//input[@class = 'btn btn-primary']")).click();

	}

	@Test(priority = 3)
	public void registerAccountWithNoDetails() {
		driver.findElement(By.xpath("//input[@class = 'btn btn-primary']")).click();

	}

	@Test(priority = 4)
	public void registerAccountWithExistingEmailID() {
		driver.findElement(By.xpath("//input[@id = 'input-firstname']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@id = 'input-lastname']")).sendKeys("Panda");
		driver.findElement(By.xpath("//input[@id = 'input-email']")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.xpath("//input[@id = 'input-telephone']")).sendKeys("987654321");
		driver.findElement(By.xpath("//input[@id = 'input-password']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@id = 'input-confirm']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@name = 'agree']")).click();
		driver.findElement(By.xpath("//input[@class = 'btn btn-primary']")).click();
		String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]"))
				.getText();
		String expectedWaningMessage = "Warning: E-Mail Address is already registered!";
		Assert.assertTrue(actualWarningMessage.contains(expectedWaningMessage));
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
