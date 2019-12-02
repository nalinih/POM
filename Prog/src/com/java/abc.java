package com.java;

import java.util.Scanner;

class abc
{
  public static void main(String[] args)
  {
    String text;
    Scanner input= new Scanner(System.in);
    System.out.println("Enter a string");
   text = input.nextLine();
   int a = text.length();
   System.out.println("String lenght is : " +a);
   String[] token=text.split("");
   for(int i=token.length-1;i>=0;i--){
	
	   System.out.print( token[i] + "" );
   }
   	
  }
}