package com.nt.ProgramOnException;

import java.util.Scanner;

public class ClassA {

	void meth1() {

		Scanner sc = new Scanner(System.in);

		int x = 10;
		System.out.println("Enter a number");

		int y = x / sc.nextInt(); // Here exception arise if you enter 0 and show output========Exception in
									// thread "main" java.lang.ArithmeticException: / by zero
									// at
									// Program_On_ExceptionHandling/com.nt.ProgramOnException.ClassA.meth1(ClassA.java:15)
									// at
									// Program_On_ExceptionHandling/com.nt.ProgramOnException.ClassA.main(ClassA.java:26)
		System.out.println(y);
		sc.close();
	}
	// Solution===================Here we can handle that arise Exception by
	// 2-Ways----(1)Using try-catch block
	// (2)Using throws keyword
	// (1) Using try-catch block

	void meth2() {
		Scanner sc = new Scanner(System.in);

		int x = 10;
		int y;
		int no = sc.nextInt();
		try {

			System.out.println("Enter any no :: ");
			y = x / no;
			System.out.println(y);

		} catch (ArithmeticException ae) {

			ae.printStackTrace();

		} finally {

			sc.close();
		}
	}

	/*
	 * public static void main(String[] args) { ClassA a=new ClassA();
	 * 
	 * //a.meth1(); a.meth2();
	 */

	// output::
	/*
	 * Enter any no :: 0 java.lang.ArithmeticException: / by zero at
	 * Program_On_ExceptionHandling/com.nt.ProgramOnException.ClassA.meth2(ClassA.
	 * java:35) at
	 * Program_On_ExceptionHandling/com.nt.ProgramOnException.ClassA.main(ClassA.
	 * java:53)
	 */

	// =====================================================================================================
	/*
	 * //(2) Using throws Keyword
	 * 
	 * public void meth3() throws ArithmeticException {
	 * 
	 * Scanner sc=new Scanner(System.in);
	 * 
	 * int x=10; int number=sc.nextInt(); int y=x/number; System.out.println(y);
	 * sc.close(); }
	 * 
	 * 
	 * 
	 * public static void main(String[] args) throws ArithmeticException {
	 * 
	 * ClassA a=new ClassA(); a.meth3(); }
	 * 
	 * 
	 * //output::
	 * 
	 * 0 Exception in thread "main" java.lang.ArithmeticException: / by zero at
	 * Program_On_ExceptionHandling/com.nt.ProgramOnException.ClassA.meth3(ClassA.
	 * java:65) at
	 * Program_On_ExceptionHandling/com.nt.ProgramOnException.ClassA.main(ClassA.
	 * java:72)
	 * 
	 * //===========================================================================
	 * ==================
	 */

	// (2) Using throws Keyword

	public static void main(String[] args) throws ArithmeticException {
		Scanner sc = new Scanner(System.in);

		int x = 10;
		int number = sc.nextInt();
		int y = x / number;
		System.out.println(y);
		sc.close();

	}// output
	/*
	 * 0 Exception in thread "main" java.lang.ArithmeticException: / by zero at
	 * Program_On_ExceptionHandling/com.nt.ProgramOnException.ClassA.main(ClassA.
	 * java:103)
	 */
}
