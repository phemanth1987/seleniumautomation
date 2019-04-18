package com.basic.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.basic.main.TestBase;

public class MouseEvents extends TestBase {

	public static void main(String[] args) {

		getWebDriver("chrome");
		
		//Navigate to URL
		driver.get("http://demo.guru99.com/test/newtours");
		
		WebElement lnkHome = driver.findElement(By.linkText("Home"));
		WebElement td_Home = driver.findElement(By.xpath("//a[text()='Home']/../../preceding-sibling::td"));
		
		
		
		//Initialize a builder object for Actions Class
		Actions builder = new Actions(driver);
		
		//Create an Action object to build sequence of action
		Action mouseOver = builder.moveToElement(lnkHome).build();
		
		//Getting the bgColor before mouse Over
		String bgColor = td_Home.getCssValue("background-color");
        System.out.println("Before hover: " + bgColor);  
        
        //Call perform to execute the action built
      	mouseOver.perform();    
      	
      	//Getting the bgColor after mouse Over
        bgColor = td_Home.getCssValue("background-color");
        System.out.println("After hover: " + bgColor);
        
        //Close Browser
        cleanUp();
        
		
		
		
		

	}

}
