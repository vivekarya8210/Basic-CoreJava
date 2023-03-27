package com.nt.pattern;

public class Test {

	public void p1() {
//		* 
//		* * 
//		* * * 
//		* * * * 
//		* * * * *  
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
	}

	public void p2() {
//        * 
//      * * 
//    * * * 
//  * * * * 
//* * * * * 
		for (int i = 1; i <= 7; i++) {
			for (int j = 7 - i; j > 0; j--)
				System.out.print(" ");
			for (int k = 1; k <= i; k++)
				System.out.print("*");
			System.out.println();
		}
	}

	public void p3() {
//	        * 
//	      * * * 
//	     * * * * 
//	   * * * * * * 
		for (int i = 1; i <= 7; i++) {
			for (int j = 7 - i; j > 0; j--)
				System.out.print(" ");
			for (int k = 1; k <= i * 2 - 1; k++)
				System.out.print("*");
			System.out.println();
		}
	}

	public void p4() {
//		*************
//		 ***********
//		  *********
//		   *******
//		    *****
//		     ***
//		      *
		for (int i = 7; i > 0; i--) {
			for (int j = 7 - i; j > 0; j--)
				System.out.print(" ");
			for (int j = 1; j <= i * 2 - 1; j++)
				System.out.print("*");
			System.out.println();
		}
	}

	public void p5() {
//        *
//       **
//      ***
//     ****
//    *****
//   ******
//  *******
// ********
//*********
//**********
		for (int i = 1; i <= 7; i++) {
			for (int j = 7 - i; j > 0; j--)
				System.out.print(" ");
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
	}

	public void p6() {
//	       * 
//	      * * 
//	     * * * 
//	    * * * * 
//	   * * * * * 
//	  * * * * * * 
//	 * * * * * * * 
//	 * * * * * * * 
//	  * * * * * * 
//	   * * * * * 
//	    * * * * 
//	     * * * 
//	      * * 
//	       *
		boolean b = false;
		for (int i = 1; i <= 7; i++) {
			for (int j = 7 - i; j > 0; j--)
				System.out.print(" ");
			for (int j = 1; j <= i; j++)
				System.out.print("* ");
			System.out.println();
			if (i == 7)
				b = true;
			if (b)
				i -= 2;
			if (i == -1)
				break;

		}

	}

	public void p7() {
//		* * * * * 
//		* * * * 
//		* * * 
//		* * 
//		* 
		for (int i = 7; i > 0; i--) {
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
	}

	public void p8() {
//		* * * * * * * 
//		 * * * * * * 
//		  * * * * * 
//		   * * * * 
//		    * * * 
//		     * * 
//		      * 
//		      * 
//		     * * 
//		    * * * 
//		   * * * * 
//		  * * * * * 
//		 * * * * * * 
//		* * * * * * * 
		boolean b = false;
		for (int i = 7; i > 0; i--) {
			for (int j = 1; j <= 7 - i; j++)
				System.out.print(" ");
			for (int j = 1; j <= i; j++)
				System.out.print("* ");
			System.out.println();
			if (i == 1)
				b = true;
			if (b)
				i += 2;
			if (i == 9)
				break;
		}
	}

	public void p9() {
//	        *
//	       ***
//	      *****
//	     *******
//	    *********
//	   ***********
//	  *************
//	   ***********
//	    *********
//	     *******
//	      *****
//	       ***
//	        *
		boolean b = false;
		for (int i = 1; i <= 7; i++) {
			for (int j = 7 - i; j > 0; j--)
				System.out.print(" ");
			for (int j = 1; j <= i * 2 - 1; j++)
				System.out.print("*");
			if (i == 7)
				b = true;
			if (b)
				i -= 2;
			if (i == -1)
				break;
			System.out.println();
		}
	}

	public void p10() {
//		**********************
//		*                    *
//		*                    *
//		*                    *
//		*                    *
//		*                    *
//		*                    *
//		**********************
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++)
				System.out.print(i == 1 || i == 7 || j == 1 || j == 7 ? "*" : " ");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Test p = new Test();
//		p.p1();
//		p.p2();
//		p.p3();
//		p.p4();
//		p.p5();
//		p.p7();
//		p.p8();
//		p.p9();
		p.p10();

	}

}
