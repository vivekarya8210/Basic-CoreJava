package com.nt.Encapsulation;

import java.util.*;

public class ClassB {

	void display() {

		Scanner sc = new Scanner(System.in);
		ClassA aobj = new ClassA();
		System.out.println("please enter your roll number");
		// int x=z sc.nextInt();
		// aobj.studentRollNumber=x;
		aobj.studentRollNumber = sc.nextInt();

		System.out.println("Please enter your name :");
		aobj.studentName = sc.next();

		System.out.println("Student RollNumber :" + aobj.studentRollNumber);

		System.out.println("Student Name :" + aobj.studentName);

		sc.close();
	}

	public static void main(String[] args) {
		ClassB bobj = new ClassB();
		bobj.display();

	}

}
