package com.training.java.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assinment8_2_StudentGrades {
	/**
	 * Assignment 2: Student Grades
You are tasked with creating a program to manage a student's grades for a course. The program
should allow the user to add, remove, and view grades for the student.
Requirements
1. Create two classes called StudentGrades and StudentTest . Store Student details in
StudentGrades that uses a Map to store the student's grades. (try with 3 students)
2. Create methods called studentGrades, addNewStudentGrade, removeGrade, and
viewGrades that allow the user to add grades for an assignment, remove grades for an
assignment respectively.
3. Create another class StudentTest with main method that allows the user to interact with
the student's grades by
	 */
	
	Map<String, String> studentGrades = new HashMap<String, String>();
	void addNewStudentGrade(String name,String grade) {
		studentGrades.put(name, grade);
	}
	void removeGrade(String grade) {
		studentGrades.remove(grade);
//		studentGrade
	}
	void viewGrades() {
		System.out.println(studentGrades);
	}
	public static void main(String[] args) {
		
		Assinment8_1_GroceryList gl = new Assinment8_1_GroceryList();
		gl.addItem("Rice");
		gl.addItem("Vegitables");
		gl.addItem("Snacks");
		gl.removeItem("Snacks");
		gl.viewList();
	}
	

	
	

}
