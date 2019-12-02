package com.java;

import java.util.HashSet;
import java.util.Set;

public class DuplicateArrya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[] = { "nalini", "d", "dhanvi", "nalini", "a", "c", "r", "t", "d" };
		//char chars[] = names.toCharArray();
		for(int i=0;i<names.length;i++){
			for(int j=i+1;j<names.length;j++){
				if(names[i].equals(names[j])){
					System.out.println("duplicate elemet is " + names[i]);
				
				}
			}
		}

		
		//method two
		/*Set<String> str = new HashSet<String>();
		//for(String name:names){
			///if(str.add(name)== false){
				System.out.println("Duplicate Vaule is " + name);
			}
		}*/
	}

}
