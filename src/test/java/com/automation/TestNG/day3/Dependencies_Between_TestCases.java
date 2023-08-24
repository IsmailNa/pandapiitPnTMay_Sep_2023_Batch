package com.automation.TestNG.day3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependencies_Between_TestCases {
	
	@Test(priority=1)
	public void tc1() {
		
	}
	
	@Test(priority=2, dependsOnMethods = "tc1")
	public void tc2() {
	Assert.fail();	
	}
	
	@Test(priority=3,dependsOnMethods = {"tc1", "tc2"}, alwaysRun = true, enabled=false)
	public void tc3() {
		
	}
	
	//alwaysRun=true or enabled=false ???

}
