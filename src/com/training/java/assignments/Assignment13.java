package com.training.java.assignments;

public class Assignment13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Assignment: Write a program to perform the following tasks: 1. Count the
		 * total number of words in the sentence. 2. Print the sentence words in reverse
		 * order. 3. Convert the first character of each word to uppercase and print
		 * original sentence
		 * 
		 * String sentence = "Java programming is fun and challenging";
		 */
		String sentence = "Java programming is fun and challenging";
		System.out.println("total number of words in the sentence : " + sentence.split(" ").length);
		String reverseString = "";
		String newString = "";
		for (String string : sentence.split(" ")) {
			for (int i = string.length() - 1; i >= 0; i--) {
				reverseString += string.charAt(i);
			}

			reverseString += " ";
			newString += string.replace(string.charAt(0), string.toUpperCase().charAt(0)) + " ";

		}
		System.out.println("sentence words in reverse order : " + reverseString);
		System.out.println("the first character of each word to uppercase : " + newString);
	}

}
