package com.collections;
import java.util.*;

public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LinkedList link= new LinkedList();
		java.util.LinkedList<String> list = new java.util.LinkedList<String>();
		list.add("nalini");
		list.add("dhanvi");
		list.add("minchu");
		list.add("misti");
		list.add("mittu");
		System.out.println(list);
		System.out.println("********************");
		list.addFirst("karthik");
		list.addLast("karthik");
		System.out.println(list);
		
		
		System.out.println(list.get(0));
		
		//set
		list.set(0, "love");
		System.out.println(list.get(0));
		
		///iterat data from  linked list usinf for loop
		System.out.println("======================");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
			
		}
		
		//using advance for loop
		System.out.println("********************");
		for(String str:list){
			System.out.println(str);
		}
		
	Iterator<String> str=	list.iterator();
	while(str.hasNext()){
		System.out.println(str.next());
		
		
			
	}
	}

}
