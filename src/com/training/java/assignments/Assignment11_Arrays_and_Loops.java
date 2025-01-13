package com.training.java.assignments;

public class Assignment11_Arrays_and_Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Given values are 12 ,34,11,36,87,98,93. Store the values in Array and Print
		 * second and third largest number from the above values without using
		 * collections and default sort methods
		 */

		int[] arr = new int[] { 12, 34, 11, 36, 87, 98, 93 };
		int temp, a, b, second_largest_number, third_largest_number;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("second and third largest number " + arr[arr.length - 2] + " " + arr[arr.length - 3]);
	}

}
