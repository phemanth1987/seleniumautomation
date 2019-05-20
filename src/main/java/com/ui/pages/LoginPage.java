package com.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class LoginPage {
	
	
	
	WebDriver driver;
	
	//WebElements Identification usinf @FindBy	
	@FindBy(how=How.TAG_NAME, using="h2")
	WebElement hdrLoginPage;
	
	@FindBy(name="uid")
	WebElement txtUserName;
	
	@FindBy(how=How.NAME, using="password")
	WebElement txtPassword;
	
	@FindBy(how=How.NAME, using="btnLogin")
	WebElement btnLogin;
	
	@FindBy(how=How.NAME, using="btnReset")
	WebElement btnReset;
	
	@FindBy(how=How.ID, using="message23")
	WebElement lblErrUserName;
	
	@FindBy(how=How.ID, using="message18")
	WebElement lblErrPassword;
	
	//Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Operations performed on this page
	
	public void setUserName(String userName) {
		try {
			if(txtUserName.isDisplayed()) {
				txtUserName.sendKeys(userName);
			}
		}
		catch(Exception e) {
			System.out.println("Test Fail!. Username field not found");
		}
		
	}
	
	public void setPassword(String pwd) {
		try {
			if(txtPassword.isDisplayed()) {
				txtPassword.sendKeys(pwd);
			}
		}
		catch(Exception e) {
			System.out.println("Test Fail!. Password field not found");
		}
		
	}
	
	public void clickLogin() {
		try {
			if(btnLogin.isDisplayed()) {
				btnLogin.click();
			}
		}
		catch(Exception e) {
			System.out.println("Test Fail!. Login Button not found");
		}
		
	}
	
	public String getLoginPageHeader() {
		String headerText="";
		try {
			if(hdrLoginPage.isDisplayed()) {
				headerText = hdrLoginPage.getText();
			}
		}
		catch(Exception e) {
			System.out.println("Test Fail!. Username field not found");
		}
		return headerText;
		
	}
	
	public void loginToGuru99(String userName, String password) {
		String failedElement = "";
		try {
			failedElement = "Username";
			if(txtUserName.isDisplayed()) {
				txtUserName.sendKeys(userName);
			}
			
			failedElement = "Password";
			if(txtPassword.isDisplayed()) {
				txtPassword.sendKeys(password);
			}
			
			failedElement = "Login";
			if(btnLogin.isDisplayed()) {
				btnLogin.click();
			}
		}
		catch(Exception e) {
			System.out.println("Test Fail!. "+failedElement+" not found");
		}
		
	}
	
	
	

}
