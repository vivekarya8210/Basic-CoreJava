package com.nt.InheritanceConcept;

class SubClass extends SingleInhertance {

	void meth2() {

		System.out.println("child class ===========meth2()   ");
	}

	SubClass() {
		// super();
		System.out.println("Child class default consturctor");
	}

	public static void main(String[] args) {

		SubClass sb = new SubClass();
		sb.meth2();
		sb.meth1();

	}

}
