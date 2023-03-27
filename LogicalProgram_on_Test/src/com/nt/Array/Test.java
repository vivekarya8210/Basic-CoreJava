package com.nt.Array;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test {
	public void p1() {
//		Java Program to copy all elements of one array into another array
		int a[] = new int[5];
		a[0] = 3;
		a[1] = 6;
		a[2] = 9;
		a[3] = 4;
		a[4] = 6;
		int b[] = a;
		for (int k : b)
			System.out.println(k);

	}

	public void p2() {
//		frequency of each element in the array
		int k[] = { 3, 7, 8, 4, 5, 9, 7, 8, 3, 3 };
		int l = k.length;
		Map<Integer, Integer> map = new TreeMap<>();

		for (int i = 0; i < l; i++) {
			int count = 0;
			for (int j = i + 1; j < l; j++) {
				if (k[i] == k[j])
					count++;
			}
			if (!map.containsKey(k[i]) && count != 0)
				map.put(k[i], count);

		}
		map.forEach((p, v) -> {
			System.out.println(p + " " + v);
		});

	}

	public void p3() {
//		Duplicate elements in given array
		int k[] = { 3, 7, 8, 4, 5, 9, 7, 8, 3, 3 };
		for (int i = 0; i < k.length; i++) {
			for (int j = i + 1; j < k.length; j++)
				if (k[i] == k[j])
					System.out.println(k[i]);
		}
	}

	public void p4() {
//		Print min and max num
		int k[] = { 3, 7, 8, 4, 5, 9, 7, 8, 3, 2 };
		int min = k[0], max = 0;
		for (int i = 0; i < k.length; i++) {
			if (k[i] > max)
				max = k[i];
			if (k[i] < min)
				min = k[i];
		}
		System.out.println("max=" + max + " min=" + min);
	}

	public void p5() {
//		Program to sort the elements of an array in ascending order
		int k[] = { 3, 7, 8, 4, 5, 9, 7, 8, 3, 2 };
		int temp = 0;
		for (int i = 0; i < k.length; i++) {
			for (int j = i + 1; j < k.length; j++) {
				if (k[i] < k[j]) {
					temp = k[i];
					k[i] = k[j];
					k[j] = temp;
				}
			}
		}
		for (int a : k)
			System.out.println(a);
	}

	public void p6() {
//		remove duplicate element in an Array
		int[] ar = { 3, 7, 8, 4, 5, 9, 7, 8, 3, 2 };
		Set<Integer> s = new LinkedHashSet<>();
		for (int a : ar)
			s.add(a);
		Integer[] ob = s.toArray(new Integer[s.size()]);
		for (int a : ob)
			System.out.println(a);

	}

	public static void main(String[] args) {
		Test t = new Test();
//		t.p1();
//		t.p2();
//		t.p3();
//		t.p4();
//		t.p5();
		t.p6();

	}

}
