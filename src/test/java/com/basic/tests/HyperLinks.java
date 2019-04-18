package com.basic.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.basic.main.TestBase;

public class HyperLinks extends TestBase {

	public static void main(String[] args) {
		//Get the required WebDriver
				getWebDriver("chrome");
				
				//Navigate to URL
				driver.get("http://demo.guru99.com/test/newtours");
				
				//Identify using LinkText
				WebElement lnkSupport = driver.findElement(By.linkText("SUPPORT"));
				
				//Click on it
				lnkSupport.click();
				
				//Print new page Title
				System.out.println("New Page Title is: "+driver.getTitle());
				
				//Navigate to Home Page using browser back
				driver.navigate().back();
				
				
				//Identify using partiallinkText
				WebElement lnhRegisterHere = driver.findElement(By.partialLinkText("here"));
				
				//Click on it
				lnhRegisterHere.click();
				
				//Print new page Title
				System.out.println("New Page Title is: "+driver.getTitle());
				
				//Navigate to Home Page using browser back
				driver.navigate().back();
				
				List<WebElement> lnks = driver.findElements(By.partialLinkText("Ho"));
				
				System.out.println("No of Elements found = "+ lnks.size());
				
				for(WebElement lnk : lnks) {
					System.out.println(lnk.getText());
				}
				
				//Close Browser
				cleanUp();
				
	}

}
