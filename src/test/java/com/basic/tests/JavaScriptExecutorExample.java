package com.basic.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.basic.main.TestBase;

public class JavaScriptExecutorExample extends TestBase {

	public static void main(String[] args) {
		//Initialize WebDriver
		getWebDriver("chrome");
		
		//Navigate to URL
		driver.get("http://demo.guru99.com/V4/");
		
		//Login to Guru99 		
        WebElement uid = driver.findElement(By.name("uid"));					
        driver.findElement(By.name("password")).sendKeys("amUpenu");
        
        WebElement login = driver.findElement(By.name("btnLogin"));
        //Using Native Selenium Method
//        login.click();       
        
        //Using JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].value=arguments[1];", uid, "abcdefg");
        js.executeScript("arguments[0].click();", login);
        
        cleanUp();
              
        

	}

}
