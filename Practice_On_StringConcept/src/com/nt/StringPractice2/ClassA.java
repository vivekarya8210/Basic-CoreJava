package com.nt.StringPractice2;

import java.util.Arrays;

public class ClassA {

	void meth() {

		String s1 = "java is awesome";
		String s2 = " 09/11/2022 ";

		String arr[] = s1.split(" ");
		System.out.println("length of arr::" + arr.length);

		System.out.println("Data present in arr  is : " + Arrays.toString(arr));
		for (String data : arr) {

			System.out.println(data);
		}
		System.out.println("========================");

		String arr1[] = s2.split("/ ");

		System.out.println("length of arr1  ::" + arr1.length);
		System.out.println("Data present in arr2 is ::" + Arrays.toString(arr1));

		for (String data : arr1) {

			System.out.println("Today Date is ::" + data);
		}

		System.out.println("===============================");

		String arr3[] = s1.split("  ");

		System.out.println("Data present in arr3 is :: " + Arrays.deepToString(arr3));

		System.out.println("==========================");

		String s3 = "ABCDEF";

		byte arr4[] = s3.getBytes();
		for (byte data : arr4) {

			System.out.print(data + " ");
		}
		System.out.println();
		for (byte datas : arr4) {

			System.out.print((char) datas + "    ");

		}
		System.out.println();
	}

	public static void main(String[] args) {

		ClassA a = new ClassA();
		a.meth();

	}

}
