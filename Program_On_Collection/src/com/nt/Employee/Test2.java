package com.nt.Employee;

import java.util.ArrayList;

class Employee2{
	
	String ename;
	int eid;
	
	Employee2(String ename,int eid){
		this.eid=eid;
		this.ename=ename;
		
		
	}
	
	@Override
	public String toString() {
		return"Employee Name:: "+ename+"\n"+"Employee id ::"+eid;
	}
	
	
}
public class Test2 {
	public static void main(String[] args) {
		
		Employee2 e1=new Employee2("Rajveer",450);
		Employee2 e2=new Employee2("Raj",457);
		
		ArrayList<Employee2> al=new ArrayList<Employee2>();
		
		al.add(e1);
		al.add(e2);
		
		System.out.println(al+"\n");
		
		
	}
	
	
	
	/*
	 * 
	 * o/p   [Employee Name:: Rajveer
                  Employee id ::450, Employee Name:: Raj
                  Employee id ::457]


	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	
	
	
	
	
	

}
