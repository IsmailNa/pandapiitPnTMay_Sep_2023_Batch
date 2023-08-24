package com.automation.ApplyingDataDriven_this_Super_keywords;

import java.util.Date;

public class Utilities {
	
	//customize your email for registration so that we can use this method and not worry about duplicacy
	
	public static String generateEmailWithTimeStamp() {
		Date date = new Date();
		System.out.println(date);
		String timeStamp = date.toString().replace(" ", "_").replace(":", "_");
		return "seleniumpanda" + timeStamp + "@gmail.com";
	}
	

}
