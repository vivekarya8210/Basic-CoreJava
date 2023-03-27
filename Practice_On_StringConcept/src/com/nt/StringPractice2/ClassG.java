package com.nt.StringPractice2;

//  Given a string return true if the first two chars in the String also appear at the end of the String  

//Such as with "edited"===ed----ed

public class ClassG {

	public boolean frontAgain(String s) {
		if (s.length() < 2)
			return false;
		else if (s.substring(0, 2).equals(s.substring(s.length() - 2, s.length())))
			return true;
		else
			return false;

	}

	public static void main(String[] args) {
		ClassG g = new ClassG();
		boolean s4 = g.frontAgain("edited");
		System.out.println(s4);

	}

}
