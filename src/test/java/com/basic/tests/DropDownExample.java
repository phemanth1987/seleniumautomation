package com.basic.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.basic.main.TestBase;

public class DropDownExample extends TestBase{

	public static void main(String[] args) {
		
		//Get the required WebDriver
		getWebDriver("chrome");
		
		//Navigate to URL
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		WebElement ddlCountry = driver.findElement(By.name("country"));
		
		Select slctElement = new Select(ddlCountry);
		
		slctElement.selectByVisibleText("AUSTRALIA");
		
		System.out.println("Slected Option is: "+ slctElement.getFirstSelectedOption().getText());
		
		List<WebElement> options = slctElement.getOptions();
		
		System.out.println("No of options are : "+options.size());
		
		for(int i=0; i< options.size(); i++) {
			System.out.println("Option is: "+options.get(i).getText());
			slctElement.selectByIndex(i);			
		}
		
		cleanUp();

	}

}
