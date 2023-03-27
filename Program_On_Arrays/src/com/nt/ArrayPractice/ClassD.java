package com.nt.ArrayPractice;

// Given an array of ints,return true if 6 appears as either the first or last element in the array.The array will be length 1 or more.

//  firstLast6([1,2,6])=====true
//  firstLast6([6,1,2,3])=========true
//  frstLast6([13,6,1,2,])========false

public class ClassD {

	public boolean firstLast(int[] arr) {

		if (arr[0] == 6 || arr[arr.length - 1] == 6)
			return true;
		return false;
	}

	public static void main(String[] args) {

		ClassD d = new ClassD();
		int[] input = { 1, 5, 2, 3, 6 };
		boolean b = d.firstLast(input);
		System.out.println(b);

	}

}
