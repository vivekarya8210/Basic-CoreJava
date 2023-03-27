package com.nt.ArrayPractice;

// Given an int  array  of length 2.return true if the array doesnot contains 2 or 3 and 3 or 6;

public class ClassC {

	boolean meth(int[] arr) {

		// for(int i=0;i<arr.length;i++) {

		if (arr[0] != 2 && arr[0] != 3 && arr[0] != 6 && arr[1] != 2 && arr[1] != 3 && arr[1] != 6)
			return true;

		return false;

	}

	public static void main(String[] args) {

		ClassC c = new ClassC();

		int arr1[] = { 1, 5 };

		boolean b = c.meth(arr1);
		System.out.println(b);

	}

}
