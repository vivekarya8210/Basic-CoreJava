package com.nt.MultithreadigPractice;

public class ClassThread extends Thread {

	public void run() {

		System.out.println("1st  run method executed");
	}

	public static void main(String[] args) {

		ClassThread ct = new ClassThread();

		Thread t = new Thread();

		t.run();

	}

}
