package com.nt.prac3;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {

		ArrayList<Integer> l = new ArrayList();

		l.add(20);
		l.add(30);
		l.add(10);
		l.add(50);
		l.add(33);

		System.out.println(l);

		//// code for sort the element of ArrayList
		Collections.sort(l, new MyComparator());

		System.out.println(l);

	}

}
