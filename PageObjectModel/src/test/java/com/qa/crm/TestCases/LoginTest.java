package com.qa.crm.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qa.crm.Utility.BrowserFactory;
import com.qa.crm.pages.LoginPage1;

public class LoginTest {
	WebDriver driver;
	
	@Test
	public void loginToApp(){
		driver=BrowserFactory.LaunchBrowser(driver, "Chrome", "https://ui.freecrm.com/");
		System.out.println("Page title is : " + driver.getTitle());
		LoginPage1 loginPage=PageFactory.initElements(driver, LoginPage1.class);
		loginPage.logintoCRM("nalinihky@gmail.com", "Dhanvi*19");
		
		BrowserFactory.closeBrowser(driver);
			}


}
