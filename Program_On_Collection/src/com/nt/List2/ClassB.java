package com.nt.List2;

import java.util.ArrayList;
import java.util.Iterator;

public class ClassB {

	void meth1() {

		ArrayList<ClassA> al = new ArrayList<ClassA>();

		ClassA aobj1 = new ClassA("kishan", 101, "java");
		ClassA aobj2 = new ClassA("Sujatha", 102, "java");
		ClassA aobj3 = new ClassA("vijay", 105, "oracle");
		al.add(aobj1);
		al.add(aobj2);
		al.add(aobj3);
		System.out.println(al);
		System.out.println("Retriving the data by using Iterator Interface");
		System.out.println();
		Iterator i = al.iterator();
		while (i.hasNext()) {

			System.out.println(i.next());
		}
	}

	public static void main(String[] args) {

		new ClassB().meth1();
	}

}
