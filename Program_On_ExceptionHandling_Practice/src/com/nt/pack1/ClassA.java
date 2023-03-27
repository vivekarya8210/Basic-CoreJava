package com.nt.pack1;

public class ClassA {

	void meth() {
		try {
			System.out.println(10);
			System.out.println("===================");
			System.out.println(20 / 0);
		} catch (ArithmeticException ae) {

			System.out.println("Please perform correct operation");

			// ae.printStackTrace();
		}
	}

	public static void main(String[] args) {

		ClassA a = new ClassA();
		a.meth();

	}

}
