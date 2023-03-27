package com.nt.Polymophism;

/// Example On=====================Method overloading

public class ClassA {

	private void meth1() {

		System.out.println(10);

	}

	protected void meth1(int a) {

		System.out.println(20);

	}

	public void meth1(int a, int b) {

		System.out.println(30);

	}

	public void meth1(String s, int a) {

		System.out.println(40);

	}

	public void meth1(int a, String s) {
		System.out.println(50);

	}

	public static void main(String[] args) {
		ClassA a = new ClassA();
		a.meth1();
		a.meth1(10);

	}

}
