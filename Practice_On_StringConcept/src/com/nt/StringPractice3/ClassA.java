package com.nt.StringPractice3;

//StringBuffer related program============================

public class ClassA {

	void display() {

		String s = new String("java"); // String Class

		// String s1=s.concat(" is awesome");
		// System.out.println(s1); //java is awesome

		System.out.println(s.concat(" is awesome"));

		System.out.println("=====================================");

		StringBuffer sb = new StringBuffer("java");

		// System.out.println(sb.concat(" is awesome")); //error

		// To resolve this problem we have to use append()

		System.out.println(sb.append("   is awesome"));
		// capacity()

		System.out.println(sb.capacity());

		// length()

		System.out.println(sb); // java is awesome

		System.out.println(sb.length());

		// charAt(int index)

		System.out.println(sb.charAt(3));

		// void setCharAt(int index, char ch)

		sb.setCharAt(3, 'U');

		System.out.println(sb); // javU is awesome

		// delete(int begin,int end)

		System.out.println(sb.delete(0, 2));

		// reverse()========

		System.out.println(sb); // vU is awesome

		System.out.println(sb.reverse()); // emosewa si Uv

		//// void setLength(int length)

		System.out.println(sb); // emosewa si Uv

		sb.setLength(7);
		System.out.println(sb); // emosewa

		// void ensureCapacity(int initialcapacity);===To increase the capacity
		// dynamically based on our requirement

		System.out.println(sb.capacity()); // 20

		sb.ensureCapacity(25);

		System.out.println(sb.capacity()); // 42 (current capacity+1)*2

		System.out.println("===============================");
	}

	void show() {

		StringBuilder sb1 = new StringBuilder("java");
		StringBuilder sb2 = new StringBuilder("java");

		/// capacity()

		System.out.println(sb1.capacity());

		////////////////////////// ======> boolean equals (String str)

		System.out.println(sb1.substring(0, 2).equals(sb2.substring(0, 2))); // true

		if (sb1.substring(0, 4).equals(sb2.substring(0, 4))) {

			System.out.println(sb2.substring(0, 2));

		}

	}

	public static void main(String[] args) {

		ClassA a = new ClassA();
		a.display();
		a.show();
	}

}
