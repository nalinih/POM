package com.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Java Selenium\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		System.out.println(linklist.size());
		for(int i=0;i<=linklist.size();i++){
			String linklext = linklist.get(i).getText();
			System.out.println(linklext);
			}
			
		
		driver.close();
	}

}
