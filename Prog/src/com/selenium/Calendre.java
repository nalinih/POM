package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Calendre {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\Java Selenium\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://online.actitime.com/dhanvi/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("nalinihky@gmail.com");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("Dhanvi*19");
		driver.findElement(By.xpath("//a[@id='loginButton']//div[contains(text(),'Login')]")).click();
		Thread.sleep(30);
		String cal = driver.findElement(By.id("ext-gen29")).getText();
		System.out.println(cal);
		driver.findElement(By.id("x-btn-center")).click();
		//Select sc = new Select(driver.findElement(By.xpath("//tr[@id='ext-gen69']//td[contains(@class,'x-btn-center')]")));
		//sc.selectByVisibleText("Dec");
	
		
		}

}
