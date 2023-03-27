package com.nt.StringPractice2;

public class ClassB {

	public String meth(String s1, String s2) {

		return s1 + s2 + s2 + s1;
	}

	public static void main(String[] args) {
		ClassB b = new ClassB();

		String s = b.meth("hi", "bye");
		System.out.println(s);
	}

}
