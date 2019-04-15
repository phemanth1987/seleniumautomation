package com.basic.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {

	public static void main(String[] args) {
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
		
		//Navigate to Google search
		driver.get(url);
		
		//Identify Search field using name locator
		//Syntax driver.
		WebElement srch = driver.findElement(By.name("q"));
		
		if(srch.isEnabled()) {
			//Enter search string in the field
			srch.sendKeys("Selenium Tutorial");
			
//			srch.sendKeys("Test");
		}
		
		
		//Click on Google Search
		driver.findElement(By.name("btnK")).click();
		
		//Close the browser
		driver.close();
		

	}

}
