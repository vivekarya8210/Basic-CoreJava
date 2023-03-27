package com.nt.pack1;

public class ClassB implements Runnable {

	// Every Thread whenever we are starting a Thread,It will by default execute
	// run() method

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Run method executed==============>" + i);
		}
	}

	public static void main(String[] args) {

		ClassB bobj = new ClassB();
		Thread t = new Thread(bobj);
		t.start();
	}

}
