package com.mvcpattern;

/**
 * This is the model class which has the student data. Model class represents a
 * java class carrying data or the logic to get data.
 * 
 */
public class StudentModel {
	private String rollNo;
	private String name;

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
