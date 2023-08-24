package com.automation.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_More_Concepts {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.xpath("//a[text() = 'My Account']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[contains(text(), 'Register')]")).click();
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id = 'input-firstname']")).sendKeys("Selenium");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id = 'input-lastname']")).sendKeys("Panda");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id = 'input-email']")).sendKeys("seleniumpanda090987@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id = 'input-telephone']")).sendKeys("987654321");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id = 'input-password']")).sendKeys("Selenium@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id = 'input-confirm']")).sendKeys("Selenium@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name = 'newsletter' and @value = '1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name = 'agree']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class = 'btn btn-primary']")).click();
		
	}

}
