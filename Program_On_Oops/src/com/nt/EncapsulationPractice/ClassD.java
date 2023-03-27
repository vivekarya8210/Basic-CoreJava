package com.nt.EncapsulationPractice;

import java.util.Scanner;

public class ClassD {

	String sname;
	String sadd;

	public void setSname(String sname) {

		this.sname = sname;

	}

	public String getSname() {

		return "Student name is " + sname;
	}

	public void setSadd(String sadd) {

		this.sadd = sadd;
	}

	public String getSadd() {

		return "Student Address is  " + sadd;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ClassD c = new ClassD();
		c.setSname(sc.nextLine());
		c.setSadd(sc.nextLine());

		System.out.println(c.getSname() + "\r" + c.getSadd());

		sc.close();
	}

}
