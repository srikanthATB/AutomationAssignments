package com.training.java.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assinment8_2_StudentTest {
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
	
//	Map<String, String> studentGrades = new HashMap<String, String>();
//	void addNewStudentGrade(String name,String grade) {
//		studentGrades.put(name, grade);
//	}
//	void removeItem(String grade) {
//		studentGrades.remove(grade);
//	}
//	void viewList() {
//		System.out.println(studentGrades);
//	}
	public static void main(String[] args) {
		
		Assinment8_2_StudentGrades sg = new Assinment8_2_StudentGrades();
		sg.addNewStudentGrade("Abhi", "A");
		sg.addNewStudentGrade("Bhanu", "B");
		sg.addNewStudentGrade("Charan", "C");
		sg.removeGrade("Charan");
		sg.viewGrades();
	}
	

	
	

}
