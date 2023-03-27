package com.nt.inheritence;

public class ClassC {
	private ClassA a = new ClassA();
	private ClassB b = new ClassB();

	public static void main(String[] args) {

		ClassC c = new ClassC();

		c.a.m1();

		c.b.m1();

	}
}
