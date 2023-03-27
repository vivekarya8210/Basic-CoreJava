package com.nt.pack1;

import java.util.Scanner;

public class Calculator {

	public void div(int x, int y) {
		int division;
		try {
			division = x / y;
			System.out.println("Expected result is :: " + division);
		} catch (ArithmeticException ae) {

			System.out.println("you have entered wrong number");

		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Calculator c = new Calculator();
		System.out.println("Division" + "  " + "(/)");
		System.out.println("================================");
		System.out.println("Enter First Number :: ");
		int m = sc.nextInt();
		System.out.println("Enter Second  Number :: ");
		int n = sc.nextInt();
		c.div(m, n);

	}

}
