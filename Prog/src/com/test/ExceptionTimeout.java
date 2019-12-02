package com.test;

import org.testng.annotations.Test;

public class ExceptionTimeout {
	@Test(expectedExceptions=NumberFormatException.class)
	public void timeOut(){
		/*int i=1;
		while(i==1){
			System.out.println(i);
		}*/
		
		String a= "100A";
		Integer.parseInt(a);
	}
}
