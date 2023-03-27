package com.nt.ArrayPractice;

import java.util.Arrays;

//  Given 2 int Array, a and b,each length 3,return a new array length 2 containing their middle  elements.

//example====1 middleWay([1,2,3],[4,5,6] ?[2,5]

//example====2 middleWay([7,7,7],[3,8,6])?[7,8

public class ClassH {

	public int[] middleWay(int[] a, int[] b) {

		int[] arr = { a[1], b[1] };

		return arr;
	}

	public static void main(String[] args) {

		ClassH aobj = new ClassH();

		int[] input1 = { 9, 5, 92 };

		int[] input2 = { 15, 25, 63 };

		int[] arrays = aobj.middleWay(input1, input2);

		System.out.println(Arrays.toString(arrays));

	}

}
