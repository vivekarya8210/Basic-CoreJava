package com.nt.prac4;

public class Employee {

	String ename;

	int eno;

	Employee(String ename, int eno) {

		this.ename = ename;
		this.eno = eno;
	}

	public String toString() {
		return ename + " : " + eno;

	}

}
