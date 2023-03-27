package com.nt.ArrayPractice;

//  Given an array of ints,return true if the array is length 1 or more and the first element and the last element are equal=====

public class ClassE {

	public boolean firstLast(int[] arr) {

		if (arr.length > 1 && arr[0] == arr[arr.length - 1])
			return true;
		return false;
	}

	public static void main(String[] args) {

		ClassE e = new ClassE();

		int[] input = { 20, 20, 50, 60, 20 };

		boolean b = e.firstLast(input);
		System.out.println(b);

	}

}
