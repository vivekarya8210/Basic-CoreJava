package com.nt.Encapsulation;

import java.util.Scanner;

public class ClassD {

	void display() {

		Scanner sc = new Scanner(System.in);
		ClassC cobj = new ClassC();
		System.out.println("please enter your roll number");
		// int x=sc.nextInt();
		// cobj.setStudentRollNumber(x);

		cobj.setStudentRollNumber(sc.next());

		System.out.println("Please enter your name :");
		cobj.setStudentName(sc.next() + "  " + sc.next());

		System.out.println("Student RollNumber :" + cobj.getStudentRollNumber());

		System.out.println("Student Name :" + cobj.getStudentName());

		sc.close();
	}

	public static void main(String[] args) {
		ClassD dobj = new ClassD();
		dobj.display();

	}

}
