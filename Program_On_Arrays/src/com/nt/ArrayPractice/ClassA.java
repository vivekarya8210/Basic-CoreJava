package com.nt.ArrayPractice;

import java.util.Arrays;

public class ClassA {

	void meth() {

		System.out.println("===========Implementing Array===============");

		int arr[] = new int[5];

		arr[0] = 102;
		arr[1] = 160;
		arr[2] = 560;
		arr[3] = 270;
		arr[4] = 96;

		System.out.println(arr); // o/p comes in hashcode

		System.out.println(Arrays.toString(arr));

		///////// length of Array

		System.out.println(arr.length);

		Arrays.sort(arr);

		for (int x : arr) {

			System.out.println(x);
		}
		System.out.println("=========================================");
		char[] c = new char[5];

		c[0] = 'f';
		c[1] = 'y';
		c[2] = 'u';
		c[3] = 'z';
		c[4] = 'a';

		System.out.println(c);

		Arrays.sort(c);
		System.out.println(c);

		System.out.println("=======================================");

		String[] s = new String[5];

		s[0] = "abc";
		s[1] = "cef";
		s[2] = "ghi";
		s[3] = "gno";
		s[4] = "bbc";

		System.out.println(Arrays.toString(s));
		for (String s1 : s) {
			System.out.print(" " + s1);

		}
		System.out.println("");
		boolean[] b = new boolean[5];
		b[0] = true;
		b[1] = false;
		b[2] = true;

		System.out.println(Arrays.toString(b));

	}

	public static void main(String[] args) {
		new ClassA().meth();

	}

}
