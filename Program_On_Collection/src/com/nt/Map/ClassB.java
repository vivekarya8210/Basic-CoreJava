package com.nt.Map;

import java.util.HashMap;
import java.util.Map;

// java program to store the key-pair values using HashMap

public class ClassB {

	public static void main(String[] args) {

		// HashMap Implementation

		HashMap<Integer, String> m = new HashMap<Integer, String>();

		m.put(1, "Raju");
		m.put(2, "Rajeev");
		m.put(3, "Raushan");
		m.put(4, "Trisha");
		System.out.println("It is not sychronized");

		// Traversing through Map using for-each loop
		for (Map.Entry<Integer, String> me : m.entrySet()) {

			// System.out.println(me.getKey()+" "+me.getValue());

			System.out.println(me.getValue());

			if (me.getValue() == "Hi") {

				System.out.println("Hi");
			}

		}

	}

}
