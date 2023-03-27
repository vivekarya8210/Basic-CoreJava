package com.nt.pack1;

public class ClassA extends Thread {

	public void run() {

		for (int i = 1; i <= 5; i++) {

			System.out.println("Run method executed=======>" + i);
		}
	}

	public static void main(String[] args) {
		// ClassA aobj=new ClassA();

		Thread t = new Thread();
		t.start(); // here start() method belong to Thread Class======due to this here it is access
					// by Thread class object refence.

	}

}
