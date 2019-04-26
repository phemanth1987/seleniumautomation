package com.basic.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.basic.main.TestBase;

public class MouseEventsToolTip extends TestBase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		getWebDriver("chrome");	
		
		driver.get("http://demo.guru99.com/test/tooltip.html");
		
		String expectedTooltip = "What's new in 3.2";
		
		WebElement download = driver.findElement(By.xpath(".//*[@id='download_now']"));	
		
		//Initialize a builder object for Actions Class
        Actions builder = new Actions (driver);		
        
        //Create an Action object to build sequence of action
        Action mouseOver = builder.moveToElement(download).build();	
        //Call perform to execute the action built
      	mouseOver.perform();  
        				
        
        
        WebElement toolTipElement = driver.findElement(By.xpath(".//*[@class='box']/div/a"));							
        String actualTooltip = toolTipElement.getText();			
        
        System.out.println("Actual Title of Tool Tip  "+actualTooltip);							
        if(actualTooltip.equals(expectedTooltip)) {							
            System.out.println("Test Case Passed");					
        }else 
        	System.out.println("Test Case Failed");
		
        
      //Navigate to URL
//      		driver.get("http://demo.guru99.com/test/newtours");
//		WebElement lnkHome = driver.findElement(By.linkText("Home"));
//		WebElement td_Home = driver.findElement(By.xpath("//a[text()='Home']/../../preceding-sibling::td"));
        
//		Actions builder = new Actions(driver);
//		
//		//Create an Action object to build sequence of action
//		Action mouseOver = builder.moveToElement(lnkHome).build();
//		
//		//Getting the bgColor before mouse Over
//		String bgColor = td_Home.getCssValue("background-color");
//        System.out.println("Before hover: " + bgColor);  
        
          
      	
//      	//Getting the bgColor after mouse Over
//        bgColor = td_Home.getCssValue("background-color");
//        System.out.println("After hover: " + bgColor);
        
        //Close Browser
        cleanUp();
        
		
		
		
		

	}

}
