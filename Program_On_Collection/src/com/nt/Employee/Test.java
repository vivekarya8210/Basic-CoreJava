package com.nt.Employee;

class Employee{
	
	String ename;
	int eid;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	@Override
	public String toString() {
		return"Employee Name:: "+ename+"\n"+"Employee id ::"+eid;
	}
	
	
}
public class Test {
	public static void main(String[] args) {
		Employee   e=new Employee();
		e.setEname("Mukul");
		e.setEid(100);
	
		System.out.println(e);
		
	}

	
	
	
	/*
	 * o/p  Employee Name:: Mukul
                 Employee id ::100

	 * 
	 * 
	 */
	
	
	
	
	
	
	
	

}
