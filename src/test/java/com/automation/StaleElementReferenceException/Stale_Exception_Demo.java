package com.automation.StaleElementReferenceException;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Stale_Exception_Demo {
	
	public WebDriver driver;
	
	@Test
	public void checkForStaleException() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
		List<WebElement> rediffFooterLinks = driver.findElements(By.xpath("//div[@class = 'footer alignC']/a"));
		System.out.println("Total footer links are : " + rediffFooterLinks.size() );
		
		for(int i=0 ; i<rediffFooterLinks.size() ; i++) {
			rediffFooterLinks.get(i).click();
			
			System.out.println("The title of this page is: " + driver.getTitle());
			
			driver.navigate().back();
			
			rediffFooterLinks = driver.findElements(By.xpath("//div[@class = 'footer alignC']/a"));
		}
	}
	
	
	@Test
	public void checkForBBC() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bbc.com");
		
		List<WebElement> bbcHeaderLinks = driver.findElements(By.xpath("//nav[@class = 'orbit-header-links international']/descendant::a"));
		System.out.println("Total footer links are : " + bbcHeaderLinks.size() );
		
		for(int i=0 ; i<bbcHeaderLinks.size() ; i++) {
			bbcHeaderLinks.get(i).click();
			
			System.out.println("The title of this page is: " + driver.getTitle());
			
			driver.get("https://bbc.com");
			
			bbcHeaderLinks = driver.findElements(By.xpath("//nav[@class = 'orbit-header-links international']/descendant::a"));
		}
	}

}
