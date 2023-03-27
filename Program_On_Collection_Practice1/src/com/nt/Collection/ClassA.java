package com.nt.Collection;

import java.util.ArrayList;

public class ClassA {

	void meth() {

		System.out.println("Implementing ArrayList==========>");

		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(null);
		al.add("java");
		al.add(45);
		al.add(10);
		al.add(null);
		al.add(85);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println("====================================");

		System.out.println(al.isEmpty());

		System.out.println(al.remove(2));

		// al.clear();

		// System.out.println(al);
		System.out.println(al.get(1));

		for (int i = 0; i < al.size(); i++) {

			System.out.println(al.get(i));
		}
		System.out.println("=========================");
	}

	public static void main(String[] args) {
		new ClassA().meth();

	}

}
