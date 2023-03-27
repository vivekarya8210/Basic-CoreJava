package com.nt.ArrayList;

import java.util.ArrayList;

public class ClassA {

	void meth1() {

		System.out.println("Implementing ArrayList ");

		ArrayList al = new ArrayList(); // o/p --- ArrayList : [10, java, null, 75, 42, 10, 96, 12]

		// ArrayList<Integer> al=new ArrayList<Integer>(); // o/p------ ArrayList : [10,
		// null, 75, 42, 10, 96, 12]

		al.add(10); // Insertion order is maintained

		al.add("java"); // Duplicates are allowed

		al.add(null); // null is allowed

		al.add(75); // Heterogenious element are allowed

		al.add(42); // Default capacity =10

		al.add(10); // New Capacity=(Current capacity*3/2)+1 //half

		al.add(96); // It is not synchronized by default

		al.add(12); // it is available from java 1.2v
		System.out.println("ArrayList :  " + al);

		// size() method----it is used check ArrayList size

		System.out.println(al.size());
		// isEmpty() method----it is used to check ArrayList is empty or not

		System.out.println(al.isEmpty()); // false

		// clear() method

		// al.clear(); //It is used to remove all the data in the ArrayList

		// System.out.println(al); //[] //o/p---[]
		// System.out.println("isEmpty()=====>"+al.isEmpty()); // o/p-----true

		// contains() method============> it is used to what data present in ArrayList
		// if it is present it returns===== true

		System.out.println(al.contains("java")); // op==true

		// remove() method======it is used to remove element or data from ArrayList
		// using index position or using object

		System.out.println(al.remove(3)); // op==75
		System.out.println(10); // op===10
		System.out.println(al); // op===[10, java, 75, 42, 10, 96, 12]

		// get() method=====>it is used to get element or data from ArrayList using
		// index number

		System.out.println(al.get(1));

		System.out.println(
				"---------------------------------------------------------------------------------------------");

		System.out.println("Reteriving the element using for loop");

		for (int i = 0; i < al.size(); i++) {

			System.out.println(al.get(i));
		}
		for (int i = 0; i < al.size(); i++) {

			// if(al.get(i)==al.contains("java"))

		}

	}

	public static void main(String[] args) {
		new ClassA().meth1();

	}

}
