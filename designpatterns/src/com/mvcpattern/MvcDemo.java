package com.mvcpattern;

public class MvcDemo {

	public static void main(String[] args) {
		StudentModel studentModel = new StudentModel();
		studentModel.setName("Lijo");
		studentModel.setRollNo("123");

		StudentView studentView = new StudentView();

		StudentController studentController = new StudentController(
				studentModel, studentView);

		// print view details via controller
		studentController.printView();

		// update model data via controller
		studentController.setStudentName("John");
		

		// print view details via controller
		studentController.printView();

	}

}
