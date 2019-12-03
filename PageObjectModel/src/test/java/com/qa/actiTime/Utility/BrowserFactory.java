package com.qa.actiTime.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
	public static WebDriver LaunchBrowser(WebDriver driver, String browserName, String Url){
		if(browserName.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver", "E:\\Java Selenium\\Drivers\\chromedriver.exe");
			 driver = new ChromeDriver();
			 
			
		}else if(browserName.equals("FireFox")){
			System.setProperty("webdriver.gecko.driver", "E:\\Java Selenium\\Drivers\\geckodriver.exe");
			 driver = new FirefoxDriver();
		
			
		}else if(browserName.equals("IE")){
			System.setProperty("webdriver.ie.driver", "E:\\Java Selenium\\Drivers\\IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
			 			
		}else{
			System.out.println("Browser is not supported");
		}
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(Url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	return driver;
	}
	
	public static void closeBrowser(WebDriver driver){
		driver.quit();
	}

}
