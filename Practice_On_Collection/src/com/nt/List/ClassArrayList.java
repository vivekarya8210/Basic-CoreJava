package com.nt.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ClassArrayList {
	ArrayList al = new ArrayList();;

	void meth1() {

		// Constructor in ArrayList=============== 1). ArrayList al=new ArrayList();

		System.out.println("ArrayList Implementing");

		al.add(45);
		al.add(52);
		al.add(65f); // here we take floating number
		al.add("Java"); // here we take String type data
		al.add(45); // here we take duplicate number
		al.add(null); // here we take null value
		al.add(null); // here we take duplicate null also
		System.out.println(al);
		// Code for finding ArrayList size
		System.out.println(al.size());

		// clear() method==============it will clear all the data of ArrayList

		// al.clear();

		// isEmpty() method

		System.out.println(al.isEmpty());

		// contains() method============to find any data in our ArrayList if it
		// available than this method show that data

		// System.out.println(al.contains("Java"));

		// remove() method======================removing data from ArrayList

		System.out.println(al.remove(2));
		System.out.println("Java");

		// getting output using for loop and get() method to get output one by one
		for (int i = 0; i < al.size(); i++) {

			System.out.print(al.get(i) + "  \t");

		}
		System.out.println();

	}

	/*
	 * void meth2() {
	 * 
	 * Scanner sc=new Scanner(System.in); //
	 * System.out.print("Enter Searching Data  : ");
	 * //if(al.contains(sc.next())==true) { System.out.println("java is awesome");
	 * 
	 * while(al.contains(sc.next())) {
	 * 
	 * 
	 * 
	 * System.out.println("hi");
	 * 
	 * }
	 * 
	 * 
	 * }
	 * 
	 * 
	 * // }
	 */

	// void meth3() { Scanner sc =new Scanner(System.in); Iterator i=al.iterator();
	// while(i.hasNext()) { System.out.print(i.next()+" ");

	// if(sc.next()==i.next()) {

	// System.out.println("hi"); }

	public static void main(String[] args) {

		ClassArrayList cal = new ClassArrayList();
		cal.meth1();
		// cal.meth2();
		// cal.meth3();
	}

}
