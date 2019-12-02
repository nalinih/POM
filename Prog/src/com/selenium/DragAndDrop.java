package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\Java Selenium\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/draggable/");
		driver.switchTo().frame(0);
		Actions act = new Actions(driver);
		act.clickAndHold(driver.findElement(By.cssSelector("body:nth-child(2)"))).moveToElement(driver.findElement(By.xpath("//p[contains(text(),'Drag me around')]"))).release().build().perform();
		

	}

}
