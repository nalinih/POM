package com.test;

import org.testng.annotations.*;

public class TestNGBasics {
	
		@BeforeSuite
			public void setUp(){
			System.out.println("set driver properties");
				
			}
		

		@BeforeClass
		public void launchBrowser(){
			System.out.println("launch chrme browser");
		}
		
		@BeforeTest
		public void login(){
			System.out.println("login to app");
		}
		
		@BeforeMethod
		public void enterUrl(){
			System.out.println("enter url");
		}
		
		@Test
		public void getTitle(){
			System.out.println("page title");
		}
		
		@AfterMethod
		public void logout(){
			System.out.println("log out");
		}
		@AfterTest
		public void deleteAllCokkies(){
			System.out.println("delete cookies");
		}
		

		@AfterClass
		public void closeBrowser(){
			System.out.println("closing chrme browser");
		}

		@AfterSuite
		public void testReport(){
		System.out.println("reports");
			
		}
	
		
}				
