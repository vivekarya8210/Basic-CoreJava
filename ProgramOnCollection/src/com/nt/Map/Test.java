package com.nt.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Employee {

	String ename;
	int eid;
	String eadd;

	Employee(int eid, String ename, String eadd) {
		this.eid = eid;
		this.ename = ename;

		this.eadd = eadd;
	}
}

public class Test {

	public static void main(String[] args) {

		Employee e1 = new Employee(101, "Rajeev", "Patna");
		Employee e2 = new Employee(102, "Raj", "Patna");

		HashMap<Integer, Employee> hs = new HashMap();
		hs.put(1, e1);
		hs.put(2, e2);

		/*
		 * //Traversing map using for loop for(HashMap.Entry<Integer, Employee>
		 * entrys:hs.entrySet()){ int key=entrys.getKey(); Employee e=entrys.getValue();
		 * System.out.println(key+" Details:");
		 * System.out.println(e.eid+" "+e.ename+" "+e.eadd);
		 * 
		 */

		System.out.println("==================");
		Set s = hs.entrySet();

		Iterator itr = s.iterator();

		while (itr.hasNext()) {

			Map.Entry m = (Map.Entry) itr.next();

			System.out.println(m.getKey() + "  " + m.getValue());

		}

	}

}
