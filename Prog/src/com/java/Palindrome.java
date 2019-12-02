package com.java;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original,reverse="";
		Scanner input = new Scanner(System.in);
		int lenght;
		System.out.println("-------enter a string-------");
		original=input.nextLine();
		lenght = original.length();
		for(int i=lenght -1;i>=0;i--){
			reverse= reverse +original.charAt(i);
		}
		System.out.println("reverse of the string is : " + reverse);
		if(original.equals(reverse)){
			System.out.println("The String is palindrome");

		}else
			System.out.println("The String is not a palindrome");


	}

}
