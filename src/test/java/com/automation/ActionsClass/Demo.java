package com.automation.ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Demo {
	public WebDriver driver;
	//Actions Class in Seleniun is used to handle mouse operations and keyboard actions
	
	//doubleClick()
	//clickAndHold()
	//dragAndDrop()
	//moveToElement
	//contextClick() - this is for right click
	
	@Test
	public void fewMouseOperations() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/");
		Actions actions = new Actions(driver);
		WebElement getStartedFreeButton = driver.findElement(By.id("signupModalButton"));
		
		actions.moveToElement(getStartedFreeButton).click().build().perform();
	}
	
	@Test
	public void fewKeyOperations() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.name("proceed")).sendKeys(Keys.ENTER);
		
	}

}
