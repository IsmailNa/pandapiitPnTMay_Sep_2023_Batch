package com.automation.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Opening {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver(); //Ctrl + Shift + O
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@name = 'lastname']")).sendKeys("Panda");
		driver.findElement(By.xpath("//input[@name = 'reg_email__']")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.xpath("//input[@name = 'reg_email_confirmation__']")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.xpath("//input[@name = 'reg_passwd__']")).sendKeys("Selenium@123");
	}

}
