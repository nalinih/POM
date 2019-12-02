package com.selenium;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.commons.io.FileUtils;

public class TakeScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Java Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		

		Date date = new Date();
		String CurrentDate = date.toString();
		System.out.println(CurrentDate);
		driver.get("https://www.google.com/");	
				
					TakesScreenshot ts1 = (TakesScreenshot) driver;
					File scrFle = ts1.getScreenshotAs(OutputType.FILE);
					File DesgFile = new File("E:\\Java Selenium\\ScreenShot\\test.png");
					FileUtils.copyFile(scrFle, DesgFile);
	
					//closing the browser 
					driver.close();

	}
             
}
