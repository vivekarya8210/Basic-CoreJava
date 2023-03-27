package com.nt.annanymous;

public class ClassB {

	public static void main(String args[]) {
		ClassA a = new ClassA() {
			public void m1() {
				System.out.println("hi");
			}

		};
		a.m1();
	}

}
