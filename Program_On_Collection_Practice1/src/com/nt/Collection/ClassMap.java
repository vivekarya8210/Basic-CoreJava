package com.nt.Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//HasMap Example

public class ClassMap {

	public static void main(String[] args) {

		HashMap hs = new HashMap();

		hs.put("Deepak", 5000);

		hs.put("Aman", 2000);
		hs.put("Saurav", 4000);
		hs.put("Rajeev", 7000);

		System.out.println(hs);

		System.out.println("=================");

		hs.put("Aman", 3200);

		System.out.println(hs);

		// System.out.println(hs.keySet()); it gives output =====[Saurav, Aman, Rajeev,
		// Deepak]

		// we can also get key value using below code

		Set s = hs.keySet();

		System.out.println(s); // it gives output =====[Saurav, Aman, Rajeev, Deepak]

//	System.out.println(hs.values());     it gives output ===========[4000, 3200, 7000, 5000]

		// we can get sme output using below code also

		Collection c = hs.values();

		System.out.println(c); // it gives output ===========[4000, 3200, 7000, 5000]

		Set s1 = hs.entrySet();

		Iterator its = s1.iterator();

		while (its.hasNext()) {
			Map.Entry m1 = (Map.Entry) its.next();
			System.out.println(m1.getKey() + "   " + m1.getValue());

			if (m1.getKey().equals("Rajeev")) {
				m1.setValue(15000);
				System.out.println(m1);
			}
		}
	}
}
