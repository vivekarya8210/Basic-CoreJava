package com.nt.EncapsulationPractice;

public class ClassA {

	private int studentRollNumber;
	private String studentName;

	public int getStudentRollNumber() {
		return studentRollNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentRollNumber(int studentRollNumber) {
		if (studentRollNumber < 0) {

		}
		this.studentRollNumber = studentRollNumber;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}
