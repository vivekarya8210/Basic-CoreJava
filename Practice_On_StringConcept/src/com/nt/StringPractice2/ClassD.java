package com.nt.StringPractice2;

public class ClassD {

	public String meth(String s) {
		
		String s1=s.substring(s.length()-2);
		//return s.substring(s.length()-2)+s.substring(s.length()-2)+s.substring(s.length()-2);
		return s1+s1+s1;
	}
	
	public static void main(String[] args) {
		ClassD d=new ClassD();
		String s2=d.meth("Bhiayaji");
		System.out.println(s2);
		

	}

}
