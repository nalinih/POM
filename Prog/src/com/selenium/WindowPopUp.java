package com.selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.gecko.driver", "E:\\Java Selenium\\Drivers\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				driver.manage().deleteAllCookies();
				
				driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				driver.get("http://popuptest.com/goodpopups.html");
				
				Thread.sleep(3000);
				driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #1')]")).click();
				Set<String> handler = driver.getWindowHandles();
				Iterator<String> it = handler.iterator();
				String ParentWindow = it.next();
				System.out.println("Parent Window is : " + ParentWindow);
				
				String ChildWidow = it.next();
				System.out.println("Child Window is "  + ChildWidow);
				driver.switchTo().window(ChildWidow);
				System.out.println("Page Titleof child windowis " + driver.getTitle());
				driver.close();
				
				driver.switchTo().window(ParentWindow);
				String parentTitle =driver.getTitle();
				System.out.println(parentTitle);
 				/*driver.get("https://online.actitime.com/dhanvi/login.do");
				driver.findElement(By.xpath("//input[@id='username']")).sendKeys("nalinihky@gmail.com");
				driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Dhanvi*19");
				driver.findElement(By.xpath("//a[@id='loginButton']//div[contains(text(),'Login')]")).click();
				
				
				driver.findElement(By.xpath("//a[@class,'content tasks']")).click();
				driver.findElement(By.xpath("//div[contains(@class,'addNewButton')]")).click();
				
				Thread.sleep(3000);
				driver.findElement(By.xpath("//a[@id='logoutLink']")).click();s
				driver.close();*/

	}
	
	
}
