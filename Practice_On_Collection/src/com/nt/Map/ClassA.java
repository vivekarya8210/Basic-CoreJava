package com.nt.Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ClassA {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		// try(s;){
		try {
			Map<String, String> m = null;
			System.out.println("===Choice====");
			System.out.println("1.HashMap\n2.LinkedHashMap" + "\n3.TreeMap\n4.Hashtable");
			System.out.println("Enter the Choice:");
			int choice = Integer.parseInt(s.nextLine());
			switch (choice) {
			case 1:
				m = new HashMap<String, String>();
				break;
			case 2:
				m = new LinkedHashMap<String, String>();
				break;
			case 3:
				m = new TreeMap<String, String>();
				break;
			case 4:
				m = new Hashtable<String, String>();
				break;
			default:
				System.out.println("Invalid Choice...");
				System.exit(0);
			}// end of switch
			System.out.println("Enter the number of ele:");
			int n = Integer.parseInt(s.nextLine());
			for (int i = 1; i <= n; i++) {
				System.out.println("Enter the bCode:");
				String bCode = s.nextLine(); // bcode ===bookcode
				System.out.println("Enter the bName:");
				String bName = s.nextLine();
				m.put(bCode, bName); // Adding to Map<K,V>
			}
			System.out.println("====BookDetails===");
			m.forEach((p, q) -> {
				System.out.println(p + "\t" + q);
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}// end of try-with-resource
}
