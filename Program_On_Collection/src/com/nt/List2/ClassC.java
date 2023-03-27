package com.nt.List2;

import java.util.Scanner;

public class ClassC {

	String helloName(String name) {

		System.out.println(" hi " + " " + name);

		return "";
		// return "hi"+" "+name;
	}

	public static void main(String[] args) {

		ClassC c = new ClassC();

		Scanner sc = new Scanner(System.in);
		System.out.print("please enter your name ::");
		c.helloName(sc.next());
		// String result =c.helloName(sc.next());
		// System.out.println(result);

	}

}
