package com.basic.tests;

import org.openqa.selenium.By;

import com.basic.main.TestBase;

public class ChildWindowExample extends TestBase {

	public static void main(String[] args) {
		
		//Initialize WebDriver
		getWebDriver("chrome");
		
		//Navigate to URL
		driver.get("http://demo.guru99.com/popup.php");
		
		//Get Parent window Handle and print it
		String parentWindow = driver.getWindowHandle();
		
		System.out.println("Parent Window Handle is :" + parentWindow);
		
		//Click on Click Here link
		driver.findElement(By.linkText("Click Here")).click();
		
		//Print number of windows open currently
		System.out.println(driver.getWindowHandles().size());
		
		//Invalid Failure Scenario - Trying to enter email id before switching to child window
		//Enter Email ID
		//driver.findElement(By.name("emailid")).sendKeys("test@test.com");
		
		//Loop around all open windows using For Each technique
		for(String childWindow : driver.getWindowHandles()) {			
			
			//Print Handle
			System.out.println("Child Window Handle : "+childWindow);
			
			if(!parentWindow.equalsIgnoreCase(childWindow)) {
				
				//Switch to child Window
				driver.switchTo().window(childWindow);
				
				//Enter Email ID
				driver.findElement(By.name("emailid")).sendKeys("test@test.com");
				
				//Click on Submit 
				driver.findElement(By.name("btnLogin")).click();
				
				//Close Child window
				driver.close();
								
			}
			
			
		}
		
		//Invalid Failure Scenario - Trying to click on link before switching to parent window
		//Click on Click Here link
		//driver.findElement(By.linkText("Click Here")).click();
		
		//Switch to parent
		driver.switchTo().window(parentWindow);
		
		//clean
		cleanUp();

	}

}
