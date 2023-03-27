package com.nt.Polymophism;

public class ClassC extends ClassB {

	void meth1(int a) {

		System.out.println("hello");
	}

	public static void main(String[] args) {

		ClassB b = new ClassC();
		// b.meth1(10); CE
		b.meth1();
		// Class c=new ClassB; error ===we can't hold prt cls obj with child class
		// refrence

	}

}
