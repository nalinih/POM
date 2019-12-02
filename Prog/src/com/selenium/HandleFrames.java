package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\Java Selenium\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Frames.html");
		/*driver.findElement(By.xpath("//span[@class='icon icon-xs mdi-chart-bar']")).click();
		driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys("nalinihky@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Dhanvi*08");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();*/
		
	}

}
