package com.nt.String;

public class ClassB {

	void meth() {

		System.out.println("Implementing String Class Methods");

		String s1 = "java";
		String s2 = new String("java");
		String s3 = "Java";
		String s6 = "java";
		String s4 = new String("java");
		String s5 = new String("Java");

		// == for checking address location

		System.out.println(s1 == s2); // false

		System.out.println(s1 == s3); // false

		System.out.println(s1 == s6); // true

		System.out.println("=======================================");

		// equals() methods return true if calling String equals to String

		System.out.println(s1.equals(s2)); // true

		System.out.println(s2.equals(s4)); // true
		System.out.println(s1.equals(s3)); // false
		System.out.println(s4.equals(s5)); // false

		System.out.println("==============================");

		// equalsIgnoreCase()====used to for content comparison where case is not
		// important

		System.out.println(s3.equalsIgnoreCase(s6)); // true

		// int length()=======Returns length of String

		System.out.println(s6.length());

		// concat()===========

		System.out.println(s6.concat(" is awesome"));

		String s7 = s3.concat(" is awesome");

		System.out.println(s7);

		// charAt()===========

		System.out.println(s6.charAt(2));

		// startWith()========

		System.out.println(s7.startsWith(s3)); // true

		System.out.println(s7.startsWith("Java")); // true

		System.out.println(s7.startsWith("java")); // false

		//// subString()===============

		System.out.println(s7.substring(5));
		System.out.println(s7.substring(0, 4));

		///////// replace()=================

		System.out.println(s7.replace('J', 'L'));
		System.out.println(s7.replace('i', 'T'));
		System.out.println(s7.replace('a', 'L'));

		//// indexOf()====================

		System.out.println(s7.indexOf('a'));

	}

	public static void main(String[] args) {
		new ClassB().meth();

	}

}
