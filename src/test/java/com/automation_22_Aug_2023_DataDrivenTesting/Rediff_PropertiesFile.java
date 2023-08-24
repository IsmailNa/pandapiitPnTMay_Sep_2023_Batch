package com.automation_22_Aug_2023_DataDrivenTesting;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Rediff_PropertiesFile {

	public WebDriver driver;
	public Properties prop;
	public FileInputStream ip;
	
	@Test
	public void loginRediffTest() throws Exception {
		
		prop = new Properties();
	    ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\automation_22_Aug_2023_DataDrivenTesting\\configRediff.properties");
		System.out.println(System.getProperty("user.dir"));
		
		prop.load(ip);
		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.id("login1")).sendKeys(prop.getProperty("userName"));
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("passWord"));
		driver.findElement(By.name("proceed")).click();
		
	}
}	
	
