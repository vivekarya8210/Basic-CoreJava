package com.nt.practice;

import java.util.Arrays;

public class ClassA {

	public void m1() {

		String s = "welcometojava";

		char[] c = new char[s.length()];

		for (int i = 0; i < s.length(); i++) {

			c[i] = s.charAt(i);
		}
		Arrays.sort(c);

		String s2 = new String(c);

		System.out.println(s2);

		System.out.println(s2.substring(0, 3));

	}

	public static void main(String[] args) {

		ClassA a = new ClassA();

		a.m1();

	}

}
