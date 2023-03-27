package com.nt.Array;

import java.util.Set;
import java.util.HashSet;
import java.util.Set;

//Find duplicate numbers

public class Test2 {

	public void meth(int[] m) {

		for (int i = 0; i < m.length; i++) {

			if (m[i] == m[i++]) {

				System.out.println(m[i]);
			}
		}
	}

	// Find duplicate character in char array
	public void meth2(char[] ch) {

		for (int i = 0; i < ch.length - 1; i++) {

			if (ch[i] == ch[i++]) {
				System.out.print(ch[i] + " ");

			}
		}
	}

	// Find Duplicate word from any Given String

	public Set<String> meth3(String s11) {

		/*
		 * if(input == null || input.isEmpty()) { return Collections.emptySet(); }
		 * Set<String> duplicates = new HashSet<>(); String[] words =
		 * input.split("\\s+"); Set<String> set = new HashSet<>(); for(String word
		 * :words){ if(!set.add(word)){ duplicates.add(word); } }
		 * 
		 * 
		 * return duplicates;
		 */
		Set<String> duplicates = new HashSet<>();
		String[] words = s11.split("\\s+");
		Set<String> set = new HashSet<>();
		for (String word : words) {
			if (!set.add(word)) {
				duplicates.add(word);

			}
		}
		return duplicates;
	}

	public static void main(String[] args) {
		Test2 t = new Test2();

		int[] k = { 50, 12, 15, 50, 22, 12 };
		// t.meth(k);

		char[] chr = { 'e', 'a', 'e', 'f', 'a' };

		// t.meth2(chr);

		String str = "two,one,two,five,one";

		t.meth3(str);
		System.out.println(t.meth3(str));

	}

}
