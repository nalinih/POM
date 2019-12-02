package com.test;

import org.testng.annotations.*;

public class InvocationCount {
	
	@Test(invocationCount=5)
	public void sum(){
		int a=10, b=34;
		int c=a+b;
		System.out.println("sum is " +c);
	}

}
