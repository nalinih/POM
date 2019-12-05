package com.qa.crm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage1 {
	WebDriver driver;
	
	
	public LoginPage1(WebDriver Ldriver){
		this.driver=Ldriver;
		
	}
	@FindBy(name="email") WebElement uname;
	@FindBy(name="password") WebElement passwrd;
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']") WebElement loginButton;
	
	public void logintoCRM(String username,String password){
		uname.sendKeys(username);
		passwrd.sendKeys(password);
		loginButton.click();
	}

}
