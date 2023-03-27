package com.nt.StringPractice2;

import java.util.Scanner;

public class ClassE {

	public String firstTwo(String s) {
		if (s.length() >= 3)

			return s.substring(0, 2);

		return s;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ClassE e = new ClassE();
		System.out.println("Enter any word ::");
		String s3 = e.firstTwo(sc.next());
		System.out.println(s3);

	}

}
