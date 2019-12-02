package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class GoogleTest {
	
	WebDriver driver;
	
	@BeforeSuite
	public void setUp(){
	System.out.println("set driver properties");
	System.setProperty("webdriver.gecko.driver", "E:\\Java Selenium\\Drivers\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.google.com/");
		
	}

	
	@Test(priority=2, groups="Regression")
	public void titleTest(){
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google");
	}
	
	@Test(priority=1,groups="Regression")
	public void logoTest(){
		boolean b = driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
	}
	@Test(groups="Smoke")
	public void mailLinkTest(){
		boolean b = driver.findElement(By.linkText("Gmail")).isDisplayed();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
