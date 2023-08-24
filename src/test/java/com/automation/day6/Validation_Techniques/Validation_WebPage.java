package com.automation.day6.Validation_Techniques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation_WebPage {
	
	//getTitle()
	//getCurrentUrl()
	
	public static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
		String actualTitle = driver.getTitle();
		String actualCurrentUrl = driver.getCurrentUrl();
		
		String expectedTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		String expectedCurrentUrl = "https://www.rediff.com/";
		
		if(actualTitle.equals(expectedTitle) && actualCurrentUrl.equals(expectedCurrentUrl)) {
			driver.findElement(By.className("signin")).click(); //the control will go to Login Page
		}else {
			System.out.println("Either my title or current url is incorrect");
		}
		
		//
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		String actualLoginPageTitle = driver.getTitle();
		String actualLoginPageCurrentUrl = driver.getCurrentUrl();
		
		String expectedLoginPageTitle = "Rediffmail" ;
		String expectedLoginPageCurrentUrl = "https://mail.rediff.com/cgi-bin/login.cgi";
		
		if(actualLoginPageTitle.equals(expectedLoginPageTitle) && actualLoginPageCurrentUrl.equals(expectedLoginPageCurrentUrl)) {
			driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
			driver.findElement(By.id("password")).sendKeys("Selenium@123");
			driver.findElement(By.name("proceed")).click();
		}else {
			System.out.println("Either my title or current url is incorrect");
		}
		

	}

}
