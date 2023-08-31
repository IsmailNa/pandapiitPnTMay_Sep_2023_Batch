package com.automation.MultipleWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TotalNumberOfWebElements {

	public WebDriver driver;

	@Test
	public void bbcLinks() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bbc.com");

		List<WebElement> links = driver.findElements(By.tagName("a"));
	//	List<WebElement> links = driver.findElements(By.xpath("//a"));

		// what is the total number of links ??
		System.out.println("Total links at this time: " + links.size());

		// you want to click on the 100th link out of those 289
		WebElement hundredthLink = links.get(99);
		//hundredthLink.click();
		
		// determine the context of the link or url present in the link
		System.out.println(hundredthLink.getAttribute("href"));

		// determine the x and y coordinate of the link
		System.out.println(hundredthLink.getLocation().x + "------>" + hundredthLink.getLocation().y);

		// print all the links in this BBC.com webpage
		for (int i = 0; i < links.size(); i++) {
			WebElement totalLinks = links.get(i);
			System.out.println(totalLinks.getText() + "-----------------------" + totalLinks.isDisplayed());
		}
	}

}
