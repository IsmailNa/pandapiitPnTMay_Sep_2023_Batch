package com.automation.day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alerts_PopUps {
	public WebDriver driver;
	
	@Test
	public void rediffAlert() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.className("signinbtn")).click(); //here Alert will come
		//it will disable the background webpage
		
		//so we have to first handle this alert or popup
		
		Alert alert = driver.switchTo().alert(); //Alert is an interface
		System.out.println(alert.getText()); //this will give the text inside the Alert
		Thread.sleep(2000);
		alert.accept();
		//alert.dismiss();
		
		//what are the three important methods of Alert Pop up ?
		//getText(), accept() and dismiss()
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
	}

}
