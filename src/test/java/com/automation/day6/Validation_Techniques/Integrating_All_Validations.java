package com.automation.day6.Validation_Techniques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Integrating_All_Validations {
	// WebPage Validations
	// WebElement Validations
	// Warning Messages if any especially for my negative testing
	public WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Test(priority = 1)
	public void rediffPositive() {
      driver.get("https://rediff.com");
      System.out.println(driver.getTitle());
      System.out.println(driver.getCurrentUrl());
      
      String actualTitle = driver.getTitle();
      String actualCurrentUrl = driver.getCurrentUrl();
      
      String expectedTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
      String expectedCurrentUrl = "https://www.rediff.com/";
      if(actualTitle.equals(expectedTitle) && actualCurrentUrl.equals(expectedCurrentUrl)) {
    	  driver.findElement(By.className("signin")).click();
      }else {
    	  System.out.println("Either title or current url is incorrect");
      }
      
      WebElement usernameTextBox = driver.findElement(By.id("login1"));
      WebElement passwordTextBox = driver.findElement(By.id("password"));
      WebElement signinButton = driver.findElement(By.name("proceed"));
      
      if(usernameTextBox.isEnabled() && passwordTextBox.isEnabled() && signinButton.isDisplayed() && signinButton.isEnabled()) {
    	  usernameTextBox.sendKeys("seleniumpanda@rediffmail.com");
    	  passwordTextBox.sendKeys("Selenium@123");
    	  signinButton.click();
      }else {
    	  System.out.println("WebElements are not visible or enabled");
      }
      
	}

	@Test(priority = 2)
	public void rediffNegative() {
		driver.get("https://rediff.com");
	      System.out.println(driver.getTitle());
	      System.out.println(driver.getCurrentUrl());
	      
	      String actualTitle = driver.getTitle();
	      String actualCurrentUrl = driver.getCurrentUrl();
	      
	      String expectedTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
	      String expectedCurrentUrl = "https://www.rediff.com/";
	      if(actualTitle.equals(expectedTitle) && actualCurrentUrl.equals(expectedCurrentUrl)) {
	    	  driver.findElement(By.className("signin")).click();
	      }else {
	    	  System.out.println("Either title or current url is incorrect");
	      }
	      
	      WebElement usernameTextBox = driver.findElement(By.id("login1"));
	      WebElement passwordTextBox = driver.findElement(By.id("password"));
	      WebElement signinButton = driver.findElement(By.name("proceed"));
	      
	      if(usernameTextBox.isEnabled() && passwordTextBox.isEnabled() && signinButton.isDisplayed() && signinButton.isEnabled()) {
	    	  usernameTextBox.sendKeys("seleniumpanda@rediffmail.com");
	    	  passwordTextBox.sendKeys("Selenium@123456");
	    	  signinButton.click();
	      }else {
	    	  System.out.println("WebElements are not visible or enabled");
	      }
	      
	      String actualErrorMessage = driver.findElement(By.xpath("//div[@id = 'div_login_error']/child::b")).getText();
	      String expectedErrorMessage = "Wrong username and password combination.";
	      
	      if(actualErrorMessage.contains(expectedErrorMessage)) {
	    	  System.out.println("My negative validation is true");
	      }else {
	    	  System.out.println("it is not true");
	      }
	     
	}

	@Test(priority = 3)
	public  void tutorialsNinjaPositive() {
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		WebElement logoutLink = driver.findElement(By.linkText("Logout"));
		if(logoutLink.isDisplayed()) {
			System.out.println("My login is successful");
		}else {
			System.out.println("Login unsucessful");
		}

	}

	@Test(priority = 4)
	public  void tutorialsNinjaNegative() {
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@1234567890");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
		String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
		
		if(actualWarningMessage.contains(expectedWarningMessage)) {
			System.out.println("My validation is correct");
		}else {
			System.out.println("My validation is incorrect");
		}
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
