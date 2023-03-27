package com.nt.String;

//how maany types create String

public class ClassA {

	String s1 = "java";

	String s2 = new String("java");

	char arr[] = { 'j', 'a', 'v', 'a' };
	String s3 = new String(arr);

	void meth() {
		int arry[] = { 15, 15, 45 };

		for (int x : arry) {

			System.out.println(x);
		}

	}

	public static void main(String[] args) {
		ClassA a = new ClassA();

		System.out.println(a.s1);
		System.out.println(a.s2);

		System.out.println(a.arr); // java

		System.out.println(a.arr.toString()); // [C@3feba861

		System.out.println(a.s3);

		// System.out.println(a.meth());

		a.meth();
	}

}
