package com.nt.practice1;

import java.io.*;

public class ClassC {

	/*
	 * void fileOperation1() throws Exception {
	 * 
	 * 
	 * FileInputStream fis=new
	 * FileInputStream("E:\\Advance Java\\Example\\Demo.txt");
	 * System.out.println("Connection established");
	 * 
	 * 
	 * int x; while((x=fis.read())!=-1) {
	 * 
	 * System.out.print((char)x);
	 * 
	 * } fis.close();
	 * 
	 * System.out.println();
	 */

	void fileOperation2() throws Exception {

		FileInputStream fis = new FileInputStream("E:\\Advance Java\\Example\\Demo.txt");

		FileOutputStream fos = new FileOutputStream("E:\\Advance Java\\Example\\Demo1.txt");

		System.out.println("Connection created");

		int x;

		while ((x = fis.read()) != -1) {

			fos.write(x);

		}

		fis.close();
		fos.close();

	}

	public static void main(String[] args) throws Exception {

		ClassC bobj = new ClassC();
		// bobj.fileOperation1();
		bobj.fileOperation2();
	}

}
