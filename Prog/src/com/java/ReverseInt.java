package com.java;

import java.util.Scanner;

public class ReverseInt {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		 System.out.println("Enter num1:- ");
		  num1 = sc.nextInt();
		 System.out.println("Enter num2:- ");
		 num2 = sc.nextInt();                       
		 System.out.println("\n***Before Swapping***");
		 //System.out.println("Number 1 : " + num1);
		 //System.out.println("Number 2 : " + num2);
		 System.out.println(num1 + " " + num2);
		 
		// Swap logic
		 num1 = num1 + num2;
		 num2 = num1 - num2;
		 num1 = num1 - num2;
		 System.out.println("\n***After Swapping***");
		 //System.out.println("Number 1 : " + num1);
		//System.out.println("Number 2 : " + num2);
		System.out.println(num1 + " " + num2);
		
		
		
		
	}

}
