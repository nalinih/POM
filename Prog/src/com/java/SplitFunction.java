package com.java;

public class SplitFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String str="my name is nalini";
		
		String strArray[]=str.split(" ");
		for(int i=0;i<=strArray.length-1;i++){
			System.out.println(strArray.length);
		}
		//String value= System.out.println(strArray[i]);*/
		
		String str="my name is nalini";
		char ch[]=str.toCharArray();
		String temp[]=str.split(" ");
		for(int i =0;i<temp.length;i--){
			System.out.print(temp[i]);
			
		}System.out.println();
		System.out.println(str.length());
	}

}
