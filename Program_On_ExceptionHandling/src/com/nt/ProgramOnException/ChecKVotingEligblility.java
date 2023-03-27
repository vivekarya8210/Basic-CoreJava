package com.nt.ProgramOnException;

public class ChecKVotingEligblility {

	/*
	 * static void checkAge(int age) { if(age>18) throw new
	 * ArithmeticException("Access granted :: You are  eligble for voting"); else
	 * throw new
	 * ArithmeticException("Access denied :: you not are eligbile for voting");
	 * 
	 * }
	 */
	public void meth1(int age) {
		try {
			if (age > 18)
				System.out.println("Access granted :: You are  eligble for voting");

		} catch (ArithmeticException ae) {
			System.out.println("hi");
			ae.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// checkAge(10);

		ChecKVotingEligblility c = new ChecKVotingEligblility();
		c.meth1(1);
	}

}
