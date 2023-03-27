package com.nt.ArrayPractice;

//  Given 2 Arrays of  ints, a and b, return true if they have the same first element or they have the same last element.

//  Both arrays will be length  1 or more .

public class ClassG {

	public boolean commonEnd(int[] a, int[] b) {
		if (a[0] == b[0] && a[a.length - 1] == b[b.length - 1])
			return true;
		return false;
	}

	public static void main(String[] args) {

		ClassG g = new ClassG();

		int[] input1 = { 35, 56, 75 };
		int[] input2 = { 35, 45 };
		boolean b = g.commonEnd(input1, input2);
		System.out.println(b);

	}

}
