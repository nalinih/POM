package com.selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.google.common.base.Verify;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\Java Selenium\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		Select stl = new Select(driver.findElement(By.id("searchDropdownBox")));
		List actuallist =new ArrayList();
		List<WebElement> list = stl.getOptions();
		
		for(int i=0;i<list.size();i++){
			String data=list.get(i).getText();
			actuallist.add(data);
			System.out.println(data);
			
		}
		List temp= new ArrayList();
		temp.addAll(actuallist)	;
		Collections.sort(actuallist);
		Assert.assertTrue(actuallist.equals(temp));
		
		/*for(WebElement wb:list){
		String dlist=wb.getText();
		actuallist.add(dlist);
		//System.out.println(dlist);
			
		}
		List temp= new ArrayList();
		temp.addAll(actuallist)	;
		Collections.sort(temp,Collections.reverseOrder());
		//Assert.assertTrue(actuallist.equals(temp));*/
	
	}

}
