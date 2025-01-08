package com.training.java.assignments;

import java.util.ArrayList;
import java.util.List;

public class Assinment8_1_GroceryTest {
	/**
	 * Assignment 1: Grocery List
You are tasked with creating a program to manage a grocery list. The program should allow the user
to add, remove, and view items in the list.
Requirements
1. Create two classes called GroceryList that uses an to store the grocery items in the list and
Another class GroceryTest to call and execute the methods.
2. Create methods called groceryList, addItem, removeItem, and viewList that allow the user to
add items to the list, remove items from the list, and view the current items in the list,
respectively.
3. Create another class GroceryTest with main method that allows the user to interact with
the grocery list by calling the appropriate methods.
	 */
	
//	List<String> groceryList = new ArrayList<String>();
//	void addItem(String item) {
//		groceryList.add(item);
//	}
//	void removeItem(String item) {
////		groceryList.remove(0);
//		groceryList.remove(item);
//	}
//	void viewList() {
//		System.out.println(groceryList);
//	}
	public static void main(String[] args) {
		
		Assinment8_1_GroceryList gl = new Assinment8_1_GroceryList();
		gl.addItem("Rice");
		gl.addItem("Vegitables");
		gl.addItem("Snacks");
		gl.removeItem("Snacks");
		gl.viewList();
	}
	

	
	

}
