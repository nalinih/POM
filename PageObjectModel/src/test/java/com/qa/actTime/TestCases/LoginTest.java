package com.qa.actTime.TestCases;

import org.openqa.selenium.WebDriver;

import com.qa.actiTime.Utility.BrowserFactory;

public class LoginTest {
	WebDriver driver;
	
	public void loginToApp(){
		driver=BrowserFactory.LaunchBrowser(driver, "Chrome", "https://ui.freecrm.com/");
		System.out.println(driver.getTitle());
		System.out.println();
	}

}
