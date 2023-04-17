package com.nt.ArrayList3;

//User defined object in collection Classes

public class ClassA {

	String empName;
	int empId;
	String empDept;

	public ClassA(String empName, int empId, String empDept) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empDept = empDept;
	}

	@Override
	public String toString() {
		return "ClassA [empName=" + empName + ", empId=" + empId + ", empDept=" + empDept + "]";
	}

}
