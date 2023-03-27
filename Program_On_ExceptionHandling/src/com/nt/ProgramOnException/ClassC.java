//  throws::  (1)We can use throws keyword to deligate responsibility of Exception to the caller(it may be another method or JVM
//                      Than caller method is responsible to handle that Exception.
//                     (2)throws keyword is  required only for  Exception and Usage of throws keyword for unchecked Exception there is no
//                           use and Impact.
//                     (3) throws keyword required only to convice compiler and usage of throws keyword doesnot prevent abnormal 
//                           termination of the program.

package com.nt.ProgramOnException;

import java.util.Scanner;

public class ClassC {

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
		ClassC b = new ClassC();

		b.meth3();
	}
}
