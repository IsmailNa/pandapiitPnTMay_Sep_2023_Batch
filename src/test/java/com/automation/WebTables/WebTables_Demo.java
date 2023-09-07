package com.automation.WebTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTables_Demo {
	//print 5 companies and their respective current prices
	//The first 5 rows of the webtable to be printed with their 5 cols

	public WebDriver driver;
	
	@Test
	public void findCertainValue() {
		String companyName = "Orient Paper";
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		
		List<WebElement> names = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr/td[1]"));
		List<WebElement> prices = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr/td[4]"));
		
		System.out.println("total number of companies at this point in time: " + names.size());
		System.out.println("respective prices at this point in time: " + prices.size());
		
		//print all the company names along with their current prices
		for(int i=0 ; i<names.size() ; i++) {
			if(companyName.equals(names.get(i).getText())) {
				System.out.println(names.get(i).getText() + "------------->" + prices.get(i).getText());
				break;
			}
			
		}
	}
	
	@Test
	public void first5Rows() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr[position() <=5]"));
		
		for(int i=0 ; i<rows.size() ; i++) {
			System.out.println(rows.get(i).getText());
		}
	}

}
