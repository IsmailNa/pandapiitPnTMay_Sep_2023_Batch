package com.automation.ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment {
	
	public WebDriver driver;
	
	@Test
	public void checkingMouseAndKeyboard() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get("https://demoqa.com/text-box");
		
		Actions actions = new Actions(driver);
		
		//Enter the fullname
		driver.findElement(By.id("userName")).sendKeys("Selelenium Panda");
		driver.findElement(By.id("userEmail")).sendKeys("seleniumpanda@gmail.com");
		
		WebElement currentAddress = driver.findElement(By.id("currentAddress"));
		currentAddress.sendKeys("8133 Leesbug Pike, Vienna");
			
		//Select the full current address
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("a");
		actions.keyUp(Keys.CONTROL);
		actions.build().perform();
		
		//Copy the address
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("c");
		actions.keyUp(Keys.CONTROL);
		actions.build().perform();
		
		//Switching to another Address
		actions.sendKeys(Keys.TAB);
		actions.build().perform();
		
		//pasting to Permanent Address
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("v");
		actions.keyUp(Keys.CONTROL);
		actions.build().perform();
		
		
		WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
		Assert.assertEquals(currentAddress.getAttribute("value"), permanentAddress.getAttribute("value"));
		
		
	}
	
	@Test
	public void anotherWay() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get("https://demoqa.com/text-box");
		driver.findElement(By.id("userName")).sendKeys("Kia Sari");
		driver.findElement(By.id("userEmail")).sendKeys("kia@kia.com");
		WebElement currentaddress=driver.findElement(By.id("currentAddress"));
		currentaddress.sendKeys("McLean, Va 22102");

		currentaddress.sendKeys(Keys.CONTROL,"A");
		currentaddress.sendKeys(Keys.CONTROL,"C");

		WebElement permanentAdd=driver.findElement(By.id("permanentAddress"));
		permanentAdd.sendKeys(Keys.CONTROL,"V");
		
		Assert.assertEquals(currentaddress.getAttribute("value"), permanentAdd.getAttribute("value"));
	}

}
