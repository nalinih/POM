package com.collections;
import java.util.ArrayList;;       

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar = new ArrayList();
		ar.add("10");
		ar.add("nalini");
		ar.add("dhanvi");
		System.out.println(ar.get(1));
		System.out.println(ar.size());
		ar.add("karthik");
		
		for(int i=0;i<ar.size();i++){
			System.out.println(ar.get(i));
		}
	
	}
	
	Employee el =new Employee("nalini", 32, "QA");
	Employee e2 =new Employee("madhura", 33, "dev");
	Employee e3 =new Employee("shantala", 34, "PM");
	Employee e4 =new Employee("divya", 30, "TSG");
	
	ArrayList<Employee> ar1= new ArrayList<Employee>();
	
	
	

}
