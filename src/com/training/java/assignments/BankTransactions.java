package com.training.java.assignments;

import java.util.ArrayList;
import java.util.List;

public class BankTransactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * Bank Transactions
Positive value refers Credit and Negative refers Debit Transaction
Transactions Amount
1 50000
2 -2000
3 3000
4 -15000
5 -200
6 -300
7 4000
8 -3000
First Store all the transactions in any data structure of Your Choice from collections, and by using
Loops and conditional statements
1. Print total number of credit and debit transactions completed
2. Print the total amount credited and debited in account
3. Print total amount remaining at the end in Bank Account
4. If any transaction limit exceeds +/- 10000 then print the message “Suspicious credit/ debit
Transaction with Amount” and also print total number of suspicious transactions
		 */
		
		List<Integer> transactions = new ArrayList<Integer>();
		transactions.add(50000);
		transactions.add(-2000);
		transactions.add(3000);
		transactions.add(-15000);
		transactions.add(-200);
		transactions.add(-300);
		transactions.add(4000);
		transactions.add(-3000);
		int debit=0,creadit=0,total=0,count=0;
		System.out.println("total number of credit and debit transactions completed : "+transactions.size());
		for (Integer transaction : transactions) {
			if(transaction>0)
				creadit+=transaction;
			else 
				debit+=transaction;
			total+=transaction;
			if(transaction > 10000 || transaction < -10000) {
				System.out.println("Suspicious credit/ debit Transaction "+ transaction);
		        count++;
			}
		       
		}
		System.out.println("the total amount credited and debited in account "+creadit +" and "+debit);
		 System.out.println("Print total amount remaining at the end in Bank Account "+total);
		 System.out.println("total number of suspicious transactions "+count);
		
		
		
		
		
		

	}

}
