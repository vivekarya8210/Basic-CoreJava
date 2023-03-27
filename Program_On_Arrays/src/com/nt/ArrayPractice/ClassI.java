package com.nt.ArrayPractice;

public class ClassI {

	public void meth(int[] arr) {

		int arr1[] = { arr[0], arr[1], arr[2] };

		if ((arr1[0] + arr1[1]) == 6) {

			System.out.println("Sum of arr[0] and arr[1] :: " + (arr1[0] + arr1[1]));
		} else if ((arr1[1] + arr1[2]) == 6) {
			System.out.println("Sum of arr[1] and arr[2] :: " + (arr1[1] + arr1[2]));

		} else {

			System.out.println("Sum of arr[2] and arr[0] :: " + (arr1[0] + arr1[2]));
		}

	}

	public static void main(String[] args) {
		ClassI i = new ClassI();
		int[] input = { 5, 1, 1 };

		i.meth(input);

	}

}
