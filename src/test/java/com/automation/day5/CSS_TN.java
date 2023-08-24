package com.automation.day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_TN {
	
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		
		WebElement searchOption = driver.findElement(By.name("search"));
		System.out.println(searchOption.getTagName());
		
		List<WebElement> tags = driver.findElements(By.tagName("input"));
		System.out.println(tags.size());
		
		
		  loginTest(); 
		  Thread.sleep(2000);
		  driver.findElement(By.linkText("My Account")).click(); 
		  registerTest();
		 

	}
	
	public static void loginTest() {
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.findElement(By.cssSelector("div.list-group>a:nth-of-type(13)")).click();
		driver.findElement(By.cssSelector("div#content > div.buttons > div > a")).click();
	}
	
	
	public static void registerTest() {
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Selenium");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Panda");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("seleniumpanda0099@gmail.com");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("1234567890");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("#content > form > fieldset:nth-child(3) > div > div > label:nth-child(1) > input[type=radio]")).click();
		driver.findElement(By.cssSelector("input[name=agree]")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
	
	}

}
