package com.training.java.assignments;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment13_3 {

	public static void main(String[] args) {

		/*
		 * Assignment: Write a program to print * in triangle pattern 1. If I will pass
		 * int rows = 5 then it should print triangle with 5 Rows
		   
		    *
		   **
		  ***
		 ****
		*****
		 
		 */

		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= 5; j++) {

				if (i <= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
