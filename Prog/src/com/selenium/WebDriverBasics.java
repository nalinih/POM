package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\Java Selenium\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();//(firefox driver is a class which is implimenting wedriver interface)
		driver.get("https://www.flipkart.com/");
		String title = driver.getTitle();
		System.out.println(title);
		String ActualTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		
		if(title.equals(ActualTitle)){
			System.out.println("Correct Title");
		}else{
			System.out.println("incorrect title");
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getPageSource());
		}
		
		
		
		driver.close();
	}

}
