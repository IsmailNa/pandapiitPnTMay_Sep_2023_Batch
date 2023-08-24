package com.java.day8_oops_polymorphism_Abstraction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Execution_Flights implements DeccanAirways, SprintFlight {

	public static void main(String[] args) {
	//	DeccanAirways dc = new DeccanAirways();
	//	SprintFlight sf = new SprintFlight();
		
		DeccanAirways dc = new Execution_Flights(); //this class is known as implementing Class
		
		WebDriver driver = new ChromeDriver();
		WebDriver driver1 = new FirefoxDriver();
		WebDriver driver2 = new EdgeDriver();
		
		driver.get("https://rediff.com");

	}


	@Override
	public void deccanFlightLogic() {
		
		
	}

	@Override
	public void deccanPaymentOption() {
		
		
	}

	@Override
	public void sprintFlightLogic() {
		
		
	}

	@Override
	public void sprintFlightPayment() {
		
		
	}

}
