package com.oopspart1;

public class MethodOverloading {//when the method name is same but with different arguments or input parameter with in the same class

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		
	}
	public void sum(){
		System.out.println("sum method with zero para");
	}
	public void sum(int i){
		System.out.println("sum method with one input para");
		System.out.println(i);
	}
	public void sum(int i, int j){
		System.out.println("sum method with two input para");
	}
}
