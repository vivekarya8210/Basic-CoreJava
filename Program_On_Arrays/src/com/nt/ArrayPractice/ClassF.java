package com.nt.ArrayPractice;

//  Return an int array length 3 containing the first 3 digits of pi,{3,1,4}
//  make pi() ? [3,1,4]

public class ClassF {

	public int[] makePi() {
		int arr[] = { 3, 1, 4 };

		// return arr;
		return new int[] { 3, 1, 4 };
	}

	public static void main(String[] args) {

		ClassF e = new ClassF();

		int[] result = e.makePi();

		for (int x : result) {

			System.out.print(x + " ");
		}

	}

}
