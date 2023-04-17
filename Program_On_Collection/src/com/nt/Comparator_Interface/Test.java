package com.nt.Comparator_Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee {

	String ename;
	int eid;
	int eage;

	public Employee(String ename, int eid, int eage) {

		this.ename = ename;
		this.eid = eid;
		this.eage = eage;

	}

}

//coding for Employee Age sorting

class EmpAge implements Comparator {

	public int compare(Object obj1, Object obj2) {

		Employee e1 = (Employee) obj1;

		Employee e2 = (Employee) obj2;
		if (e1.eage == e2.eage)
			return 0;
		else if (e1.eage > e2.eage)
			return 1;

		else
			return -1;
	}

}
// coding for Employee Name sorting

class EmpName implements Comparator {

	public int compare(Object obj1, Object obj2) {

		Employee e1 = (Employee) obj1;

		Employee e2 = (Employee) obj2;

		return e1.ename.compareTo(e2.ename);
	}

}

public class Test {

	public static void main(String[] args) {

		ArrayList<Employee> al = new ArrayList();

		al.add(new Employee("Rajveer", 145, 25));
		al.add(new Employee("Balwan", 545, 35));
		al.add(new Employee("Saidu", 155, 29));

		Collections.sort(al, new EmpName());

		for (Employee e : al) {

			System.out.println(e.ename + " ");

		}
		System.out.println("=================================");

		Collections.sort(al, new EmpAge());

		for (Employee e : al) {

			System.out.println(e.eage + " ");

		}

	}

}
