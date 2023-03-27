package com.nt.Array;

import java.util.StringTokenizer;

public class Test3 {

	public static void main(String[] args) {

		String s1 = "it is java program it is java program";
		StringTokenizer st = new StringTokenizer(s1);
		String s2[] = new String[st.countTokens()];
		int ari = 0;
		while (st.hasMoreElements()) {
			// System.out.println(st.nextElement());
			s2[ari] = (String) st.nextElement();
			ari++;
		}
//	for(String s:s2)
//		System.out.println(s);
		for (int i = 0; i < s2.length; i++) {
			for (int j = i + 1; j < s2.length; j++) {
				if (s2[i].equals(s2[j]))
					System.out.print(s2[i] + " ");

			}
		}

	}

}
