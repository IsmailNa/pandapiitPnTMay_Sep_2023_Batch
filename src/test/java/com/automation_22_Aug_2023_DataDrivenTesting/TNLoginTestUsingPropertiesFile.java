package com.automation_22_Aug_2023_DataDrivenTesting;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TNLoginTestUsingPropertiesFile {
	
	public WebDriver driver;
	public Properties prop;
	public FileInputStream ip;
	
	@Test
	public void loginTest() throws Exception {
		//Step 1 - Create the Object of Properties Class
		prop = new Properties();
		
		//Step 2 - Create the Object of FileInputStream Class and pass the path of the .properties file inside this constructor
		ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\automation_22_Aug_2023_DataDrivenTesting\\configTN.properties");
		System.out.println(System.getProperty("user.dir"));
		
		//C:\\Users\\sarth\\eclipse-workspace\\PnTMay_Sep_2023_Batch == System.getProperty("user.dir") 
		//so we can replace the above part of the path with System.getProperty("user.dir")
		
		
		//Step 3 - Load the properties file
		prop.load(ip);
		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(prop.getProperty("validEmail"));
		driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("validPassword"));
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
	}
	
	

}
