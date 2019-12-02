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

public class IsDisplayed {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\Java Selenium\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://api.cogmento.com/register/");
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
		//driver.findElement(By.xpath("//input[@id='phone_number']")).sendKeys("1234569087");
		
		
		/*isDisplayed Method - applicable to allthe elements
		boolean b1 = driver.findElement(By.xpath("//div[contains(text(),'Validate your Phone')]")).isDisplayed();
		System.out.println(b1);
		
		boolean b2 = driver.findElement(By.xpath("//div[contains(text(),'Validate your Phone')]")).isEnabled();
		System.out.println(b2);*/
		
		
		//is selected();
		
		boolean b3 = driver.findElement(By.xpath("//input[@id='terms']")).isSelected();
		System.out.println(b3);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File Scr = ts.getScreenshotAs(OutputType.FILE);
		File Des = new File("C:\\Users\\user\\workspace\\Prog\\Screenshots_Verification\\isenabled.png");
		FileUtils.copyFile(Scr, Des);

	}

}
