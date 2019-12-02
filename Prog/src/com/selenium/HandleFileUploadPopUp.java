package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class HandleFileUploadPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\Java Selenium\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://html.com/input-type-file/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("E:\\Java Selenium\\nalini.html");

	}

}
