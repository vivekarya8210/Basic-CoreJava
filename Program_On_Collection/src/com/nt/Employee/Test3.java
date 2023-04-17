package com.nt.Employee;

import java.util.ArrayList;
import java.util.Iterator;

class Employee3 {

	String ename;
	int eid;

	public void setEname(String ename) {
		this.ename = ename;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	@Override
	public String toString() {
		return "Employee Name:: " + ename + "\n" + "Employee id ::" + eid;
	}

}

public class Test3 {
	public static void main(String[] args) {
		Employee3 e = new Employee3();

		e.setEid(400);
		e.setEname("Raju");
		e.setEid(500);
		e.setEname("kaju");


		System.out.println(e);

		ArrayList<Employee3> al = new ArrayList<Employee3>();
		
		Iterator itr=al.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			
				
			}
			
			
		}
		

	}


