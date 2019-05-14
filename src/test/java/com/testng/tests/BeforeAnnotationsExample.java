package com.testng.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;

public class BeforeAnnotationsExample {
	WebDriver driver = null;
	
	  @Test(enabled=false)
	  public void test2() {
		  	String actualTitle = "";
			String expTitle = "Google"; 
			
			
			actualTitle = driver.getTitle();
			
			
			//Compare Actual and Expected
			Assert.assertEquals(actualTitle, expTitle);
			
//			if(actualTitle.equals(expTitle))
//				System.out.println("Test Passed!");
//			else
//				System.out.println("Test Failed!!");
		  
	  }
	  
	  @Test(enabled=false)
	  public void test1() {
		  	String actualTitle = "";
			String expTitle = "Facebook"; 
			
			
			actualTitle = driver.getTitle();
			
			
			//Compare Actual and Expected
			Assert.assertEquals(actualTitle, expTitle);
//			if(actualTitle.equals(expTitle))
//				System.out.println("Test Passed!");
//			else
//				System.out.println("Test Failed!!");
		  
	  }
	  
	  
	  @Test
	  @Parameters({"username"})
	  public void test3(String username) {
		  System.out.println("Parameter value is : "+username);
		  
	  }
	  
	 @BeforeMethod
	 public void beforeMethod() {
		 String url = "http://www.google.com";
			
			//Launch browser and open URL
			driver.get(url);
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method code");
	}
	
	  @BeforeTest
	  public void beforeTest() {
			String browser = "chrome";
			
			if(browser.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
				driver = new ChromeDriver();	
			}
			else if(browser.equals("firefox")) {
				System.setProperty("webdriver.gecko.driver", "src/test/resources/chromedriver.exe");
				driver = new FirefoxDriver();
			}			
			
		  
	  }
	
	  @AfterTest
	  public void afterTest() {
		  
		  //Close driver
		  driver.quit();
	  }

}
