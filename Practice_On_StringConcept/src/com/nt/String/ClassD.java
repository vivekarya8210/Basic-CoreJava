package com.nt.String;

public class ClassD {

	void meth() {
		System.out.println("implementing String clasa object");

		String s2 = "java is awesome";
		System.out.println(s2.replace('j', 'l'));
		System.out.println(s2.substring(0, 4));
		System.out.println("====================");

	}

	public static void main(String[] args) {
		ClassD d = new ClassD();
		d.meth();

	}

}
