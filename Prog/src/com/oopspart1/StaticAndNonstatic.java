package com.oopspart1;

public class StaticAndNonstatic {
	
	String name = "Dhanvi";//non static global variable
	static int dob=1;//static lobal variable
	

	public static void main(String[] args) {
		// how to call static method and class name
		//1)direct calling - 
		sum();
		//2)calling class name 
		StaticAndNonstatic.sum();
		
		System.out.println(dob);
		System.out.println(StaticAndNonstatic.dob);
		
		//how to callnon static methods and variable
		StaticAndNonstatic obj = new StaticAndNonstatic();
		obj.sendmail();
		System.out.println(obj.name);
	}
	
	public void sendmail(){
		System.out.println("sending mail");
	}
	public static void sum(){
		System.out.println("sum methods");
	}
}
