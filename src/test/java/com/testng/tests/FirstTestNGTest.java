package com.testng.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirstTestNGTest {

  //@Test Annotation to mark the method beow it as test case. NO Main method needed. 	
  @Test
  public void firstTestNGScript() {
	  WebDriver driver = null;
		String browser = "chrome";
		
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
			driver = new ChromeDriver();	
		}
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "src/test/resources/chromedriver.exe");
			driver = new FirefoxDriver();
		}
		
		
		String url = "http://www.google.com";
		String actualTitle = "";
		String expTitle = "Google"; 
		
		//Launch browser and open URL
		driver.get(url);
		//Thread.sleep(10000);
		actualTitle = driver.getTitle();
		
		
		//Compare Actual and Expected
		if(actualTitle.equals(expTitle))
			System.out.println("Test Passed!");
		else
			System.out.println("Test Failed!!");
		
		driver.quit();
  }//End of Test
  
  
}//End of class
