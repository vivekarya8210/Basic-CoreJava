package com.nt.StringPractice2;

import java.util.Scanner;

public class ClassC {

	public String meth(String s1, String s2) {

		// System.out.println(s1.substring(0,2)+s2+s1.substring(2));
		String s = s1.substring(0, 2) + s2 + s1.substring(2);

		return s;

	}

	public static void main(String[] args) {

		ClassC c = new ClassC();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter symbol  :: ");
		String s3 = sc.next();
		System.out.println("Enter any  word ::");
		String s4 = sc.next() + " " + sc.next();
		c.meth(s3, s4);

	}

}
