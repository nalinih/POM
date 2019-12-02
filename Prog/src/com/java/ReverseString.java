package com.java;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value;
		Scanner in=new Scanner(System.in);
		System.out.println("enter a string value");
		value=in.nextLine();
		
	
		char chars[] = value.toCharArray();
		System.out.println("String lenght is : " +chars.length);
		for(int i=chars.length-1;i>=0;i--){
			
			System.out.print(chars[i]);
		}

	}

}
