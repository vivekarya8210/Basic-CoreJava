package com.nt.Practice2;

import java.util.Arrays;

public class ClassA {

	void meth() {

		int x = -25;
		boolean isPrime = true;
		for (int i = 2; i < x; i++) {

			if (x % 2 == 0) {

				isPrime = false;
			}
		}

		if (isPrime) {

			System.out.println(x + " is a Prime Number  ");
		} else {

			System.out.println("not a prime number");
		}
	}

	public static void main(String[] args) {
		ClassA a = new ClassA();
		a.meth();

	}

}
