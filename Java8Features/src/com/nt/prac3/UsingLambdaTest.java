package com.nt.prac3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UsingLambdaTest {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList();

		l.add(20);
		l.add(30);
		l.add(10);
		l.add(50);
		l.add(33);

		System.out.println(l);

		Comparator<Integer> c = (i1, i2) -> (i1 < i2) ? -1 : (i1 > i2) ? 1 : 0;

		Collections.sort(l, c);

		System.out.println(l);
		// code for printing data one by one
		l.stream().forEach(System.out::println);

		// code for checking data is even or not

		List<Integer> l2 = l.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());

		System.out.println(l2);

	}

}
