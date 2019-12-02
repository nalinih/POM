package com.java;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {1,3,5,6,7,8};
		int temp, size;
		size=num.length;
		for(int i=0;i<size;i++){
			for(int j=i+1;j<size;j++){
				if(num[i]>num[j]){
					
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		//return num[total-2];
		
		System.out.println(num[size-1]);
	}

}
