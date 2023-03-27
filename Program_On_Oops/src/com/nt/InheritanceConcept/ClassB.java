package com.nt.InheritanceConcept;

public class ClassB extends ClassA {

	void meth2() {

		System.out.println("child class method");
	}

	public static void main(String[] args) {

		ClassA aobj = new ClassA(); // HAS -A -RELATION

		aobj.meth1();

		// aobj.meth2(); //C.E

		System.out.println("-----------------------------------");
		ClassA aobj2 = new ClassB();

		aobj2.meth1();
		// aobj2.meth2(); //C.E
		System.out.println("--------------------");

		ClassB bobj = new ClassB();
		bobj.meth1(); // parent class method

		bobj.meth2(); // child class method

	}

}
