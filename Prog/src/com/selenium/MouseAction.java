package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\Java Selenium\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.spicejet.com/");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//li[@id='header-addons']//a[@id='highlight-addons']"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("SpiceLounge")).click();  
	}

}
