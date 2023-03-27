package com.nt.practice1;

import java.io.FileInputStream;

public class ClassA {

	void fileOperation1() throws Exception {

		FileInputStream fis = new FileInputStream("E:\\Advance Java\\Example\\Demo.txt");

		// System.out.println("Connection created");

		int x;
		while ((x = fis.read()) != -1) {

			System.out.print((char) x);

		}
		System.out.println();

		// System.out.println("Data reterived");
		fis.close();

	}

	public static void main(String[] args) throws Exception {
		ClassA aobj = new ClassA();

		aobj.fileOperation1();
	}

}
