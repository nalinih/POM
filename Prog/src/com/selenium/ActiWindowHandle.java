package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActiWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\Java Selenium\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://online.actitime.com/dhanvi/login.do");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("nalinihky@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Dhanvi*19");
		driver.findElement(By.xpath("//a[@id='loginButton']//div[contains(text(),'Login')]")).click();
		
		
		driver.findElement(By.xpath("//a[@class,'content tasks']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'addNewButton')]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
		driver.close();
	}

}
