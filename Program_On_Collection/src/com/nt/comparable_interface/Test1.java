package com.nt.comparable_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {

	String sName;
	int sAge;
	int sRollNo;

	Student(String sName, int sAge, int sRollNo) {

		this.sName = sName;
		this.sAge = sAge;
		this.sRollNo = sRollNo;

	}
// code for sort list  Student a/c  to their age

	public int compareTo(Student s) {

		if (sAge == s.sAge)
			return 0;
		else if (sAge > s.sAge)
			return 1;
		else
			return -1;

	}

}

public class Test1 {

	public static void main(String[] args) {

		/*
		 * Student s1=new Student("Raushan",23,205); Student s2=new
		 * Student("Mayank",25,285); Student s3=new Student("Kishor",29,215);
		 * 
		 * ArrayList al=new ArrayList(); al.add(s1); al.add(s2); al.add(s3);
		 */

		// 2nd way

		ArrayList<Student> al = new ArrayList();

		al.add(new Student("Rajeev", 25, 145));
		al.add(new Student("Jeevan", 23, 245));
		al.add(new Student("Mayank", 25, 140));

		 Collections.sort(al);

		for (Student s : al) {

			System.out.println(s.sRollNo + " " + s.sName + " " + s.sAge);

		}

	}
}
