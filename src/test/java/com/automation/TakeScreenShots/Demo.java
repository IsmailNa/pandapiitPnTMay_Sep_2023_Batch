package com.automation.TakeScreenShots;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Demo {
	
	public WebDriver driver;
	
	@Test
	public void checkScreenShot() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://openweathermap.org/");
		WebElement logo = driver.findElement(By.cssSelector("div.section.where-to"));
		File source = logo.getScreenshotAs(OutputType.FILE);
		File destination = new File(System.getProperty("user.dir") + "\\test-output\\Screenshots\\logo1.png");
		
		FileHandler.copy(source, destination);
	}
	

}
