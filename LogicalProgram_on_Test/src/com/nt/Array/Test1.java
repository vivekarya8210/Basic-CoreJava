package com.nt.Array;

//Remove Duplicate char from charcter array

import java.util.Iterator;
// for removing duplicate character in char[] array
import java.util.LinkedHashSet;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) {

		char[] ch = { 'a', 'b', 'd', 'a', 'b', 'e' };

		Set<Character> s = new LinkedHashSet<>();
		for (char ch2 : ch) {

			s.add(ch2);
		}

		System.out.println(s);   //output is ===                      [a, b, d, e]
		
		System.out.println("===================");
		
		Iterator itr=s.iterator();
		
		while(itr.hasNext()) {
			
			char c11=(char)itr.next();
			
			System.out.print(c11+" ");  //Output is =====       a b d e 
			
			
			
		}
		
		

	}

}
