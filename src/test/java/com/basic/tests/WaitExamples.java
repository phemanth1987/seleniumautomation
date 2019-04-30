package com.basic.tests;

import org.openqa.selenium.By;

import com.basic.main.TestBase;

public class WaitExamples extends TestBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub http://www.google.com
		//Initialize WebDriver
		getWebDriver("chrome");
		
		//Navigate to URL
		driver.get("http://www.google.com");
		
		long startTime = System.currentTimeMillis();
		 
	   	 
	    try {
	    	//Trying to click on invalid element
			//Identifying Login Button with CSS Class     Syntax .ClassValue
			driver.findElement(By.id("invalidString")).click();
	    }catch(Exception e) {}
			
		
		long endTime = System.currentTimeMillis();
		 
	    long duration = (endTime - startTime); 
	    
	    System.out.println(duration);
		
		cleanUp();
	}

}
