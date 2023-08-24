package com.automation.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_In_Selenium {
	// id
	// class
	// name
	// linkText
	// partiallinkText
	// xpath
	// cssSelector
	// tagname


	public static void main(String[] args) throws Exception {
	
		facebookCreateNewAccount();	
		tnRegister();
		//rediffLogin();

	}
	
	public static void tnRegister() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("//input[@id = 'input-firstname']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@id = 'input-lastname']")).sendKeys("Panda");
		driver.findElement(By.xpath("//input[@id = 'input-email']")).sendKeys("seleniumpanda122@gmail.com");
		driver.findElement(By.xpath("//input[@id = 'input-telephone']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@id = 'input-password']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@id = 'input-confirm']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@name = 'newsletter' and @value = '1']")).click();
		driver.findElement(By.xpath("//input[@name = 'agree']")).click();
		driver.findElement(By.xpath("//input[@class = 'btn btn-primary']")).click();	
	}

	public static void rediffLogin() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		driver.findElement(By.xpath("//a[@class = 'signin']")).click();
		driver.findElement(By.xpath("//input[@id = 'login1']")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@name = 'proceed']")).click();

	}
	
	public static void facebookCreateNewAccount() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@name = 'lastname']")).sendKeys("Panda");
		driver.findElement(By.xpath("//input[@name = 'reg_email__']")).sendKeys("seleniumpanda@gmail.com");	
		driver.findElement(By.xpath("//input[@name = 'reg_email_confirmation__']")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.xpath("//input[@name = 'reg_passwd__']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//button[@name = 'websubmit']")).click();
	}

}
