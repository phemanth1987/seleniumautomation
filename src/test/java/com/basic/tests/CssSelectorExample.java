package com.basic.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.basic.main.TestBase;

public class CssSelectorExample extends TestBase {

	public static void main(String[] args) {
		//Initialize WebDriver
		getWebDriver("chrome");
		
		//Navigate to URL
		driver.get("https://login.wordpress.org/?locale=en_US");
		
		//Identifying Header with CSS Tagname    Syntax Tagname
		String toolTip = driver.findElement(By.cssSelector("h1")).getText();
		System.out.println(toolTip);
		
		//Identifying Username with CSS ID    Syntax #IDValue
		driver.findElement(By.cssSelector("#user_login")).sendKeys("example");
		
		//Identifying Password with CSS attribute and Value     Syntax [attribute='value']
		driver.findElement(By.cssSelector("[name='pwd']")).sendKeys("example");
		
		//Identifying Remember Me ChkBox with CSS Parent and Direct Child     Syntax Parent>Child
		driver.findElement(By.cssSelector(".login-remember>label>input")).click();
		
		//Identifying Login Button with CSS Class     Syntax .ClassValue
		driver.findElement(By.cssSelector(".button.button-primary")).click();
		
		//Identifying Error with CSS Tag and Id     Syntax Tag#IdValue
		WebElement loginError = driver.findElement(By.cssSelector("div#login_error"));
		
		if(loginError.isDisplayed()) {
			//Identifying Lost your Password with CSS nth-child     Syntax :nth-child(index)
			String linkText = driver.findElement(By.cssSelector("#nav>a:nth-child(2)")).getText();
			System.out.println(linkText);
		}
		
		//Clean up
		cleanUp();

		
	}

}
