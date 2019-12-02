package com.java;

public class SwapTwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//method #1
		String a= "nalini";
		String b= "dhanvi";
		System.out.println("before swap");
		System.out.println("value of a is : " + a);
		System.out.println("Value of b is : " + b);

		/*String c;
		c=a;
		a=b;
		b=c;
		System.out.println("value of a is : " + a);
		System.out.println("Value of b is : " + b);*/
		a=a+b;
		b=a.substring((0),a.length()-b.length());
		a=a.substring(b.length());
		
		System.out.println("value of a after swapping is : " + a);
		System.out.println("Value of b after swapping is : " + b);

	}

}
