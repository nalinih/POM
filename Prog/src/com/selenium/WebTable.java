package com.selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable {

	public static void main(String[] args) throws IOException {
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
		String Sxpath = "/html[1]/body[1]/div[11]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/table[2]/tbody[2]/tr[";
		String Expath = "]/td[2]/div[1]/div[2]/div[1]/div[1]/div[1]";
		
		
		//Method 1
		for (int i=1;i<=4;i++){
			
			String Name = driver.findElement(By.xpath(Sxpath + i +Expath)).getText();
			System.out.println(Name);
			if(Name.contains("NASA negotiations")){
				driver.findElement(By.xpath("/html[1]/body[1]/div[11]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/table[2]/tbody[2]/tr["+i+"]/td[2]/div[1]/div[2]/div[1]/div[1]/div[1]")).click();
			}
		TakesScreenshot tsc = (TakesScreenshot) driver;
		File scr= tsc.getScreenshotAs(OutputType.FILE);
		File Des= new File("C:\\Users\\user\\workspace\\Prog\\Screenshots_Verification\\Acti.png");
		FileUtils.copyFile(scr, Des);
		
		}
	}

}
