package com.training.java.assignments;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment13_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Assignment: Write a program to search for all occurrences of a “Java” word in
		 * the paragraph and print their indexes. 1. Divide into multiple words 2. Find
		 * total number of occurrences 3. Print count and Indexes of the word
		 * 
		 * String paragraph = "Java is a popular programming language. Java is used for
		 * web development, mobile applications, and more.";
		 */
		String paragraph = "Java is a popular programming language. Java is used for web development, mobile applications, and more.";
		String reverseString = "";
		String newString = "";
		int count = 0, indexes = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (String string : paragraph.split(" ")) {
			System.out.println(string);
			if (string.equals("Java")) {
				count++;
				map.put(indexes, count);

			}
			indexes += string.length() + 1;

		}
		System.out.println("total number of occurrences of a “Java” word in the paragraph : " + count);
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			Integer key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println("count : " + val + " Index : " + key);

		}

	}

}
