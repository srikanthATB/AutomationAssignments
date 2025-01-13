package com.training.java.assignments;

public class Assignment12_Diamond {
	public static void main(String[] args) {

		/**
		 * Print the numbers in diamond-shaped pyramid of numbers. Pattern should be as
		 * below.
		 * 
		 *  
	1 
   1 2 
  1 2 3 
 1 2 3 4 
1 2 3 4 5 
 1 2 3 4
  1 2 3
   1 2
    1
		 * 
		 */

		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > 0; j--) {
				if (j <= i) {
					System.out.print(i - j + 1 + " ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				if (j >= i)
					System.out.print(" " + (j - i + 1));
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}
