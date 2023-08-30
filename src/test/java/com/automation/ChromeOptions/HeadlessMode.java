package com.automation.ChromeOptions;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HeadlessMode {

	public ChromeOptions options; 
	public WebDriver driver;
	
	@Test
	public void demoTest() {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("headless");
		driver = new ChromeDriver(options);
		driver.get("https://rediff.com");
		System.out.println(driver.getTitle());
	}
}
