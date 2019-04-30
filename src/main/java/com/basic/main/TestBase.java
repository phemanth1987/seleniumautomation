package com.basic.main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver = null;
	//String browser = "chrome";
	
	public static WebDriver getWebDriver(String browser) {
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
			driver = new ChromeDriver();	
		}
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "src/test/resources/chromedriver.exe");
			driver = new FirefoxDriver();
		}
		
		//Adding Implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Maximize the browser Window
		driver.manage().window().maximize();
		
		return driver;
	}
	
	
	
	public static void cleanUp() {
		driver.close();
	}
	
	

}
