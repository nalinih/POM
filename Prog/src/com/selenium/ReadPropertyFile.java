package com.selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadPropertyFile {

	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties pr = new Properties();
		FileInputStream fs = new FileInputStream("C:\\Users\\user\\workspace\\Prog\\src\\config.properties");
		pr.load(fs);
		String url = pr.getProperty("Url");
		System.out.println(url);
		String browserName = pr.getProperty("browserName");
		System.out.println(browserName);
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "E:\\Java Selenium\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		}
		else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "E:\\Java Selenium\\Drivers\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			
		}else if (browserName.equals("IE")){
			System.setProperty("webdriver.ie.driver", "E:\\Java Selenium\\Drivers\\IEDriverServer.exe");
			WebDriver driver = new InternetExplorerDriver();
	}

		driver.get(url);
		driver.findElement(By.xpath(pr.getProperty("User_Name_Xpath"))).sendKeys(pr.getProperty("User_Name"));
		driver.findElement(By.xpath(pr.getProperty("Login_pwd_Xpath"))).sendKeys(pr.getProperty("Login_pwd"));
		driver.findElement(By.xpath(pr.getProperty("Login_Button"))).click();
		
}
}
