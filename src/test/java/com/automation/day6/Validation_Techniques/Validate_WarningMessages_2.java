package com.automation.day6.Validation_Techniques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validate_WarningMessages_2 {
	public static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

		// Privacy Policy
		String actualPrivacyPolicyWarningMessage = driver
				.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
		String expectedPrivacyPolicyWarningMessage = "Warning: You must agree to the Privacy Policy!";

		// First Name
        String actualFirstNameWarningMessage = driver
				.findElement(By.xpath("//div[contains(text(), 'First Name must be between 1 and 32 characters!')]"))
				.getText();
		String expectedFirstNameWarningMessage = "First Name must be between 1 and 32 characters!";

		// Last Name
		String actualLastNameWarningMessage = driver
				.findElement(By.xpath("//div[contains(text(), 'Last Name must be between 1 and 32 characters!')]"))
				.getText();
		String expectedLastNameWarningMessage = "Last Name must be between 1 and 32 characters!";

		// Telephone
		String actualTelephoneWarningMessage = driver
				.findElement(By.xpath("//div[contains(text(), 'Telephone must be between 3 and 32 characters!')]"))
				.getText();
		String expectedTelephoneWarningMessage = "Telephone must be between 3 and 32 characters!";

		// Email
		String actualEmailWarningMessage = driver
				.findElement(By.xpath("//div[contains(text(), 'E-Mail Address does not appear to be valid!')]"))
				.getText();
		String expectedEmailWarningMessage = "E-Mail Address does not appear to be valid!";

		// Password
		String actualPasswordWarningMessage = driver
				.findElement(By.xpath("//div[contains(text(), 'Password must be between 4 and 20 characters!')]"))
				.getText();
		String expectedPasswordWarningMessage = "Password must be between 4 and 20 characters!";
		
		if(actualPrivacyPolicyWarningMessage.contains(expectedPrivacyPolicyWarningMessage)) {
			System.out.println("My validation is correct but I have not selected the Checkbox of Privacy Policy");
		}else {
			System.out.println("Something is not right");
		}
		
		
	}

}
