package com.nt.practice1;

import java.io.*;

public class ClassB {

	void fileOperation1() throws Exception {

		FileInputStream fis = new FileInputStream("E:\\Advance Java\\Example\\Demo.txt");
		System.out.println("Connection established");

		int x;
		while ((x = fis.read()) != -1) {

			System.out.print((char) x);

		}
		fis.close();

		System.out.println();
	}

	void fileOperation2() throws Exception {

		FileOutputStream fos = new FileOutputStream("E:\\Advance Java\\Example\\Demo.txt", true);
		System.out.println("Connection created");
		String data = ", Java is awesome";

		byte arr[] = data.getBytes();

		fos.write(arr);
		System.out.println("Task is completed");

		fos.close();

	}

	public static void main(String[] args) throws Exception {

		ClassB bobj = new ClassB();
		bobj.fileOperation1();
		bobj.fileOperation2();
	}

}
