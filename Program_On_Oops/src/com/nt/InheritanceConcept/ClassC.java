package com.nt.InheritanceConcept;

public class ClassC {

	void meth1() {

		System.out.println("Class-C method");
	}

	ClassC() {

		System.out.println("ClassC default constructor");

	}

	ClassC(String s) {

		this();
		System.out.println(s);
	}

}
