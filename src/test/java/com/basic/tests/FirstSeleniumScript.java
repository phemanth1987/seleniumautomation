package com.basic.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumScript {

	public static void main(String[] args) throws Exception {
		
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

	}

}
