package com.basic.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.basic.main.TestBase;

public class AlertExample extends TestBase {

	public static void main(String[] args) {
		//Initialize WebDriver
		getWebDriver("chrome");
		
		//Navigate to URL
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		//Enter Customer ID
		driver.findElement(By.name("cusid")).sendKeys("12345");
		
		//Click on Submit
		driver.findElement(By.name("submit")).click();
		
		//Switch to alert
		Alert popUp = driver.switchTo().alert();
		
		//Print Alert Message
		System.out.println(popUp.getText());
		
		//Click on OK
		popUp.accept();
		
		//Switch to new Alert
		//popUp = driver.switchTo().alert();
		
		//Print Success Message
		System.out.println(popUp.getText());
		
		//Click on OK
		popUp.accept();
		
		//now try to enter another cust ID
		driver.switchTo().defaultContent();
		//Enter Customer ID
		driver.findElement(By.name("cusid")).sendKeys("98765");
		
		//Click on Submit
		driver.findElement(By.name("submit")).click();
		
		//Switch to alert
		popUp = driver.switchTo().alert();
		
		//Click on OK
		popUp.dismiss();
				
		
		//Clean
		cleanUp();
		
		

	}

}
