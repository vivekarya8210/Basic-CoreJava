package com.nt.pattern;

public class ClassB {

	public static void main(String[] args) {
		int l = 5;
		boolean b = false;
		for (int i = 1; i <= l; i++) {

			for (int j = l - i; j > 0; j--)
				System.out.print("   ");

			for (int k = 1; k <= i; k++) {
				if (i == 1 || k == 1 || k == l)
					System.out.print("*");
				else
					System.out.print("  ");
			}
			if (i == l)
				b = true;
			if (b)
				i -= 2;
			if (i == -1)
				break;
			System.out.println();

		}

	}
}
