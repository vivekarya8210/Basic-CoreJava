package com.nt.practice1;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ClassD {

	void fileOperation2() throws Exception {

		FileInputStream fis = new FileInputStream("E:\\Advance Java\\Example\\nt.jpg");

		FileOutputStream fos = new FileOutputStream("E:\\Advance Java\\Example\\nt1.jpg");

		System.out.println("Connection created");

		int x;

		while ((x = fis.read()) != -1) {

			fos.write(x);

		}

		fis.close();
		fos.close();

	}

	public static void main(String[] args) throws Exception {

		ClassD obj = new ClassD();

		obj.fileOperation2();

	}

}
