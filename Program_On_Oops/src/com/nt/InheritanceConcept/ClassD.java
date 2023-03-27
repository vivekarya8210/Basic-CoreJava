package com.nt.InheritanceConcept;

public class ClassD extends ClassC {

	void meth2() {
		// this(10); error
		System.out.println("Class D method");
		super.meth1();
	}

	void meth3() {

		System.out.println("meth3() called");
	}

	ClassD() {

		super("Java is awesome");
		// this(10); C.E
		System.out.println("ClassD default constructor");
		super.meth1();
		this.meth3();
	}

	ClassD(int a) {

		// this(10); error
		this();
		System.out.println("ClassD parameterized construtor" + a);

	}

	public static void main(String[] args) {
		ClassD bobj = new ClassD(10);
		bobj.meth2();

	}
}
