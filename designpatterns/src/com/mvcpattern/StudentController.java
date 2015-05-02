package com.mvcpattern;

/**
 * This class get the student data and update view. Controller controls the data
 * flow into model and update the view as required.
 */
public class StudentController {
	private StudentModel studentModel;
	private StudentView studentView;

	public StudentController(StudentModel studentModel, StudentView studentView) {
		this.studentModel = studentModel;
		this.studentView = studentView;
	}

	// control model data via controller
	public void setStudentName(String studentName) {
		this.studentModel.setName(studentName);
	}

	public String getStudentName() {
		return studentModel.getName();
	}

	// update model data via controller
	public void setStudentRollNo(String studentRollNum) {
		this.studentModel.setRollNo(studentRollNum);
	}

	public String getStudentRollNum() {
		return studentModel.getRollNo();
	}

	// update view via controller
	public void printView() {
		studentView.printStudentDetails(studentModel.getName(),
				studentModel.getRollNo());
	}

}
