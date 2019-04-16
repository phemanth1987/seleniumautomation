package com.basic.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.basic.main.*;

public class FindElements extends TestBase {
	
	//private static WebDriver driver;

	public static void main(String[] args) {
		
		//Get the required WebDriver
		getWebDriver("chrome");
		
		//Navigate to URL
		driver.get("http://demo.guru99.com/test/ajax.html");
		
		//Use findelements to get list of webElements
		//Syntax : List<WebElement> elementName = driver.findElements(By.LocatorStrategy("LocatorValue"));
		List<WebElement> listOfElements = driver.findElements(By.name("name"));
		
		//Using FindElement for button
		//Syntax : WebElement elementName = driver.findElement(By.LocatorStrategy("LocatorValue"));
		WebElement btnCheck = driver.findElement(By.id("buttoncheck"));
		
		System.out.println("No of Web Elements identified are :"+ listOfElements.size());
		
		//using Looping For
		for(int i=0; i< listOfElements.size(); i++) {
			System.out.println("Inside Standard For Loop");
			System.out.println(listOfElements.get(i).getAttribute("value"));
		}
		
		//Using For Each syntax
		for(WebElement element : listOfElements) {
			System.out.println("Inside For Each Loop");
			String text = element.getAttribute("value");
			System.out.println(text);
			
			if(text.equals("Yes")) {
				//click
				element.click();
				btnCheck.click();
				break;
			}
			
		}
		
		WebElement lblSuccess = driver.findElement(By.className("radiobutton"));
		String successMsg = lblSuccess.getText();
		System.out.println(successMsg);
		if(successMsg.contains("Yes"))
			System.out.println("Test Passed!");
		else
			System.out.println("Test Failed!");
		
		//Close the browser
		cleanUp();
		

	}

}
