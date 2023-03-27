package com.nt.basics;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Test {
	public void p1() {
//		reverse a number in Java
		int k = 12345;
		int k2 = 0;
		while (k > 0) {
			int t = k % 10;
			k2 = k2 * 10 + t;
			k = k / 10;
		}
		System.out.println(k2);
	}

	public void p2() {
		// Prime number
		int no = 11, count = 0;
		for (int i = 1; i <= no; i++) {
			if (no % i == 0)
				count++;
		}
		System.out.println(count == 2 ? "no is prime" : "no is not prime");
	}

	public void p22() {

		int no = 9;
		if (no % 2 == 0)
			System.out.println("It is even no");
		else
			System.out.println("It is not a odd no");

	}

	public void p3() {
		// swap
		int a = 7, b = 9;
		System.out.println("a = " + a + " b = " + b);
//		swap using 3rd variable
//		int temp=0;
//		temp=a;
//		a=b;
//		b=temp;

//		swap using bitwise
//		a=a^b;
//		b=a^b;
//		a=a^b;

//		swap without 3rd variable
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a = " + a + " b = " + b);
	}

	public void p4() {
//		largest 3 number
		int a = 15, b = 11, c = 77;
		int t = a > b ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println(t);
	}

	public void p5() {
//		check if a number is positive or negative
		int n = -77;
		System.out.println(n > 0 ? "number is positive" : "number is negative");
	}

	public void p6() {
		// Factors of numbers
		int n = 28;
		int sum = 0;
		for (int i = 1; i < n; i++)
			if (n % i == 0) {
				System.out.println(i);
				sum += i;
			}
		System.out.println("sum=" + sum);
		System.out.println(sum == n ? "number is perfect" : "number is not perfect");

	}

	public void p7() {
//		sum of digit number
		int n = 5433;
		int sum = 0;
		while (n > 0) {
			int t = n % 10;
			sum += t;
			n = n / 10;
		}
		System.out.println("sum = " + sum);
	}

	public void p8() {
		// palindrom number
		int n = 123212;
		int temp = n, n2 = 0;
		while (temp > 0) {
			int rem = temp % 10;
			n2 = n2 * 10 + rem;
			temp = temp / 10;

		}
		System.out.println(n == n2 ? "palindrom" : "not palindrom");
	}

	public void p9() {
		// armstrong num
		int n = 9474, count = 0;
		int temp = n;
		while (temp > 0) {
			count++;
			temp /= 10;
		}
		int sum = 0;
		temp = n;
		while (temp > 0) {
			int rem = temp % 10;
			int k = 1;
			for (int i = 1; i <= count; i++)
				k *= rem;
			sum += k;
			temp /= 10;
		}
		System.out.println(sum == n ? "aramstrong" : "not aramstrong");
	}

	// print duplicate string
	void p10() {
		String s = "it is a java program it is a java program";
		StringTokenizer st = new StringTokenizer(s);
		Set<String> set = new LinkedHashSet<>();
		while (st.hasMoreElements()) {
			set.add(st.nextToken());
		}
		String s2 = "";
		for (String ss : set)
			s2 += ss + " ";
		// s2 = "<<" + s2 + ">>";
		System.out.println(s2);
		String s3 = "";
		for (int i = s2.length() - 1; i >= 0; i--) {
			char c = s2.charAt(i);
			s3 += c;
		}
		System.out.println(s3);

	}

	// fibonic series
	public void p11() {
		int n1 = 0, n2 = 1, n3 = 0;
		System.out.println(n1);
		System.out.println(n2);
		for (int i = 1; i <= 8; i++) {
			n3 = n1 + n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;
		}
	}

	public static void main(String[] args) {
		Test t = new Test();
//		t.p1();
		// t.p2();
//		t.p3();
//		t.p4();
//		t.p5();
//		t.p6();
//		t.p7();
//		t.p8();
//		t.p9();
		t.p10();
		// t.p11();

		// t.p22();
	}

}
