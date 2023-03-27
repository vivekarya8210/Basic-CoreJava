package com.nt.ProgramOnException;

import java.util.Scanner;

//  throws::  (1)We can use throws keyword to deligate responsibility of Exception to the caller(it may be another method or JVM
//                      Than caller method is responsible to handle that Exception.
//                     (2)throws keyword is  required only for  Exception and Usage of throws keyword for unchecked Exception there is no
//                           use and Impact.
//                     (3) throws keyword required only to convice compiler and usage of throws keyword doesnot prevent abnormal 
//                           termination of the program.

public class ClassB {

	// (2) Using throws Keyword

	public void meth3() throws ArithmeticException {

		Scanner sc = new Scanner(System.in);

		int x = 10;
		int number = sc.nextInt();
		int y = x / number;
		System.out.println(y);
		sc.close();
	}

	public static void main(String[] args) throws ArithmeticException {
		ClassB b = new ClassB();
		b.meth3();

	}
}

/*
 * // output::0 Exception in thread "main" java.lang.ArithmeticException: / by
 * zero at
 * Program_On_ExceptionHandling/com.nt.ProgramOnException.ClassB.meth3(ClassB.
 * java:23) at
 * Program_On_ExceptionHandling/com.nt.ProgramOnException.ClassB.main(ClassB.
 * java:30)
 * 
 */

// ===========================================================================

/*
 * // (2) Using throws Keyword
 * 
 * 
 * public static void main(String[] args) throws ArithmeticException { Scanner
 * sc = new Scanner(System.in);
 * 
 * int x = 10; int number = sc.nextInt(); int y = x / number;
 * System.out.println(y); sc.close();
 * 
 * 
 * }//output 0 Exception in thread "main" java.lang.ArithmeticException: / by
 * zero at
 * Program_On_ExceptionHandling/com.nt.ProgramOnException.ClassA.main(ClassA.
 * java:103)
 */
