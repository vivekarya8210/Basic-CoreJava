package com.nt.programOnError;

public class ClassA {

	void meth1(int x) {
		// int x=10 // (1) Logical Error

		// return 500; /// wrong syntex here no need to return type
	}

	// Runtime Error=======Computer inefficency or Insufficient memory to store
	// data.

	public static void main(String[] args) {

		ClassA a = new ClassA();
		a.meth1(10);

	}

}
