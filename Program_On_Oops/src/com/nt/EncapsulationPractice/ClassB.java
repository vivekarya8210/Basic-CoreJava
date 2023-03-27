package com.nt.EncapsulationPractice;

import java.util.*;

public class ClassB {

	void meth1() {
		Scanner sc = new Scanner(System.in);
		ClassA a = new ClassA();
		System.out.println("please enter student rollnumber");
		// a.studentRollNumber=sc.nextInt();

		a.setStudentRollNumber(sc.nextInt());

		System.out.println("please enter student name");
		// a.studentName=sc.next();

		a.setStudentName(sc.next() + " " + sc.next());

		System.out.println("Student RollNumber :" + a.getStudentRollNumber());
		System.out.println("Student Name :" + a.getStudentName());
	}

	public static void main(String[] args) {

		new ClassB().meth1();

	}

}
