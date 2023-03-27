package com.nt.StringPractice2;

// Given a String  return a String where for every char in the original there are two chars..........

public class ClassF {

	public String doubleChar(String s) {

		String s1 = " ";

		for (int i = 0; i <= s.length() - 1; i++) {

			s1 += s.charAt(i);
			s1 += s.charAt(i);
		}
		return s1;

		// return "";

	}

	public static void main(String[] args) {
		ClassF f = new ClassF();
		String s4 = f.doubleChar("rawaan");
		System.out.println(s4);

	}

}
