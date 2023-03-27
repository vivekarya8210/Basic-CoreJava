package com.nt.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap map = new HashMap();

		map.put(101, "Name Rawan");

		map.put(102, "Name Raju");
		map.put(103, "Name keshav");

		// Print all the thing which is present in HashMap Object

		System.out.println(map);
		System.out.println("========================");

		// Print all Key Elements of HashMap

		Set s = map.keySet();

		System.out.println(s);
		System.out.println("=================");
		// Print all Value of Key Elements of HashMap
		Collection c = map.values();

		System.out.println(c);

		System.out.println("======================");

		// Print all entry obj which is present in HashMap

		Set s1 = map.entrySet();

		System.out.println(s1);

		System.out.println("==================");

		Iterator itr = s1.iterator();

		while (itr.hasNext()) {

			Map.Entry m = (Map.Entry) itr.next();

			System.out.println(m.getKey() + "  " + m.getValue() + "  " + m.getKey());
		}
		System.out.println("===================");

		System.out.println(map);

		map.put(103, "Suraj");
		map.put(103, "Rahul");
		map.put(104, "Rahul");

		System.out.println(map);

	}
}
