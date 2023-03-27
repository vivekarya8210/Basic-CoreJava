//incapsulate data using construtor

package com.nt.EncapsulationPractice;

public class ClassC {

	String sname;
	String sadd;

	ClassC(String sname, String sadd) {

		this.sname = sname;
		this.sadd = sadd;

	}

	public String toString() {

		return "Name of the Student :: " + sname + "\r " + "Address of the Student::" + sadd;
	}

	public static void main(String[] args) {

		ClassC c = new ClassC("", "");

		System.out.println(c);

	}

}
