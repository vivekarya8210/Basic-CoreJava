package com.nt.Practice;

public class Classb extends ClassA {

	static void meth1() {

		System.out.println("hello");
	}

	public static void main(String[] args) {

		Classb b = new Classb();

		System.out.println(x);
		System.out.println(b.x);

		// System.out.println(b.meth1()); CE

		// ClassA a=new Classb();
		new Classb().meth1();

	}

}
