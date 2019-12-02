package com.test;

import org.testng.annotations.*;

public class TestNGFeatures {
	
	@Test
	public void loginTest(){
		System.out.println("login test");
		int i=9/0;
	}
	@Test(dependsOnMethods="loginTest")
	public void homeTest(){
		System.out.println("home test");
	}
	@Test
	public void searchTest(){
		System.out.println("search test");
	}

}
