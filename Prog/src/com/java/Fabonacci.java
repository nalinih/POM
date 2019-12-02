package com.java;

import java.util.Scanner;

public class Fabonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, a=0, b=1, c=1;
		Scanner scr = new Scanner(System.in);
		System.out.println("please enter a number");
		num=scr.nextInt();
		System.out.println("Fibonacci Series of the number is:");

		//fab=10;
		
		for(int i=0;i<=num;i++){
			a=b;
			b=c;
			c=a+b;
			System.out.print(a + " ");
			
		}

	}

}
