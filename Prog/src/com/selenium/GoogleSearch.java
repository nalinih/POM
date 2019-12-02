package com.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\Java Selenium\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("testing");
		
		List<WebElement> list =driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
		System.out.println(list.size());
		
		//String StartX = "/html[1]/body[1]/div[1]/div[4]/form[1]/div[2]/div[1]/div[2]/div[2]/ul[1]/li[";
		//String EndX = "]/div[1]/div[2]";
		
		for(int i=1;i<=list.size();i++){
			//String name = driver.findElement(By.xpath(StartX+ i + EndX)).getText();
			System.out.println(list.get(i).getText());
			
			if(list.get(i).getText().contains("testing types")){
			//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[4]/form[1]/div[2]/div[1]/div[2]/div[2]/ul[1]/li["+i+"]/div[1]/div[2]")).click();
			list.get(i).click();
			break;
			}
			
			
		}
	}

}
