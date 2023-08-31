package com.automation.DatePicker;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Example1 {
	
	public WebDriver driver;
	
	@Test
	public void verifyHardCodedDateSelection() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
		
		String monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
		System.out.println(monthYear); //August 2023 - this is the String
		
		String month = monthYear.split(" ")[0];
		String year = monthYear.split(" ")[1];
		
		//I decide January 2024
		
		while(!(month.equals("January") && year.equals("2024"))) {
			driver.findElement(By.xpath("//a[@title = 'Next']")).click();
			monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
			month = monthYear.split(" ")[0];
			year = monthYear.split(" ")[1];
		}
		
		driver.findElement(By.xpath("//td[@data-handler = 'selectDay']/a[text() = '9']")).click();
		
		
	}
	
	@Test
	public void useCustomizeDateMethod() {
		customizedDate("20", "February", "2030");
		//customizedDate("30", "February", "2025");
		//customizedDate("32", "December", "2025");
	}
	
	
	
	public void customizedDate(String selectDay, String selectMonth, String selectYear) {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
		
		//February cannot have more than 29 days
		//Any other month cannot have more than 31 days
		
		if(Integer.parseInt(selectDay) > 31) {
			System.out.println("Invalid Date for any month");
			return;
		}
		
		if(selectMonth.equals("February") && Integer.parseInt(selectDay) > 29) {
			System.out.println("Invalid Date for Feb month");
			return;
		}
		
		
		String monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
		System.out.println(monthYear); 
		
		String month = monthYear.split(" ")[0];
		String year = monthYear.split(" ")[1];
		
		while(!(month.equals(selectMonth) && year.equals(selectYear))) {
			driver.findElement(By.xpath("//a[@title = 'Next']")).click();
			monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
			month = monthYear.split(" ")[0];
			year = monthYear.split(" ")[1];
		}
		
		String xpathDayText = "//td[@data-handler = 'selectDay']/a[text() = \'" + selectDay + "\']";
		
		try {
			driver.findElement(By.xpath(xpathDayText)).click();
		} catch (Exception e) {
			System.out.println("Invalid Date");
		}
		
	}

}
