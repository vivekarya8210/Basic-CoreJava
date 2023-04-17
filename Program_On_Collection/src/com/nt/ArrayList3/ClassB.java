package com.nt.ArrayList3;

import java.util.ArrayList;
import java.util.Iterator;

public class ClassB {

	void meth1() {

		/*
		 * ArrayList<ClassA> al = new ArrayList<ClassA>();
		 * 
		 * ClassA aobj1 = new ClassA("kishan", 101, "java"); ClassA aobj2 = new
		 * ClassA("Sujatha", 102, "java"); ClassA aobj3 = new ClassA("vijay", 105,
		 * "oracle"); al.add(aobj1); al.add(aobj2); al.add(aobj3);
		 */
		
		
		ArrayList<ClassA> al = new ArrayList<ClassA>();
		al.add(new ClassA("kishan", 101, "java"));
		al.add(new ClassA("sujatha", 102, "oracle"));
		al.add(new ClassA("vijay", 103, "ui"));
		
		
		
		System.out.println(al);
		System.out.println("======================================================");
		System.out.println("Retriving the data by using Iterator Interface");
		System.out.println();
		Iterator i = al.iterator();
		while (i.hasNext()) {

		ClassA a=(ClassA)i.next();
		
		System.out.println(a.empName+" "+a.empId+" "+a.empDept);
			
			
			
		}
	}

	public static void main(String[] args) {

		new ClassB().meth1();
	}

}
