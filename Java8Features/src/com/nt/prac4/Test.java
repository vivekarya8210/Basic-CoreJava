package com.nt.prac4;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {

		/*
		 * Employee e=new Employee("Rajeev",80); System.out.println(e);
		 * o/p=========Rajeev : 80
		 *
		 *
		 */

		ArrayList<Employee> l = new ArrayList();

		l.add(new Employee("Ankit", 100));

		l.add(new Employee("Ranjan", 450));
		l.add(new Employee("Suraj", 200));
		l.add(new Employee("Ansh", 500));
		l.add(new Employee("Vishal", 600));

		System.out.println(l);

		// Sorting Employee Based on Eployee Number============

		Collections.sort(l, (e1, e2) -> (e1.eno < e2.eno) ? -1 : (e1.eno > e2.eno) ? 1 : 0);

		System.out.println(l);

		// Sorting Based on Employee Name

		Collections.sort(l, (e1, e2) -> e1.ename.compareTo(e2.ename));

		System.out.println(l);

	}

}
