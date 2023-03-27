package com.nt.ArrayPractice;

// Given an int Array length 3,if there is 2 in the Array inmediately followed by a 3, change the  elements 3 to 0  
// and return the changed array.

//sample input===========
//123----120
//234----230
//122----122

public class ClassB {

	int[] meth() {

		int[] arr = { 12, 23, 45, 86, 75, 2, 3, 4, 3, 2, 3 };

		for (int i = 1; i < arr.length - 1; i++) {

			if (arr[i] == 2 && arr[i + 1] == 3) {

				arr[i + 1] = 0;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		// ClassB b=new ClassB();
		int arr1[] = new ClassB().meth();

		for (int x : arr1) {
			System.out.print("  " + x);
		}
	}

}
