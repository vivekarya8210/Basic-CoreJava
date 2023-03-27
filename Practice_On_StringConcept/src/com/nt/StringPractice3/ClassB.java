package com.nt.StringPractice3;

public class ClassB {
	void meth() {
		int arr[] = { 14, 25, 35, 25, 75 };

		System.out.println(arr);

		for (int i = 0; i < arr.length; i++) {

			System.out.print(" " + arr[i]);
		}
		System.out.println();
		for (int i = arr.length; i > 0; --i) {

			System.out.println(arr[i]);
		}

	}

	public static void main(String[] args) {

		ClassB b = new ClassB();

		b.meth();
	}

}
