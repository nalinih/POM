package com.java;

public class WordOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="i love dhanvi baby";
		String word ="dhanvi";
		String temp[]=str.split(" ");
		int count=0;
		for(int i =0;i<temp.length;i++){
			if(word.equals(temp[i])){
				count++;
			}
			System.out.println("the string is : " + str);
			System.out.println("the word " + word + " occurs " + count + "times in the above string");
		}
	}

}
