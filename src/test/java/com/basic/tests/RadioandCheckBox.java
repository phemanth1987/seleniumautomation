package com.basic.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.basic.main.TestBase;

public class RadioandCheckBox extends TestBase {

	public static void main(String[] args) {
		//Get the required WebDriver
				getWebDriver("chrome");
				
				//Navigate to URL
				driver.get("http://demo.guru99.com/test/radio.html");
				
				WebElement rdBtn1 = driver.findElement(By.id("vfb-7-1"));
				
				System.out.println("Radio Button status before clicking : "+rdBtn1.isSelected());
				
				if(!rdBtn1.isSelected()) {
					rdBtn1.click();
				}
				
				System.out.println("Radio Button status after clicking : "+rdBtn1.isSelected());
				
				WebElement chkBox1 = driver.findElement(By.id("vfb-6-0"));
				
				System.out.println("Checkbox 1 status before clicking: "+chkBox1.isSelected());
				
				if(!chkBox1.isSelected()) {
					chkBox1.click();
				}
				
				System.out.println("Checkbox 1 status after clicking : "+chkBox1.isSelected());
				
				cleanUp();
				

	}

}
