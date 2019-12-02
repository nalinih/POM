package com.oopspart1;

public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x="100";
		System.out.println(x+100);
		
		int i= Integer.parseInt(x);
		System.out.println(i+100);
		
		//String to double conversion
		
		String y="12.34";
		double d =Double.parseDouble(y);
		
		Boolean.parseBoolean(y);
		
		//intto string conversion
		
		int j =200;
		String.valueOf(j);
		
	}

}
