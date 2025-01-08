package com.training.java.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment8 {

	public static void main(String[] args) {
		/**
		Employee Table
		S.No Name Experience
		(Years)

		Year-End Rating (Out of

		5)

		1 Alice Johnson 75000 5 4.2
		2 Bob Smith 68000 3 3.8
		3 Carol Davis 82000 7 4.5
		4 David Brown 90000 10 2
		5 Eva Green 60000 2 3.5

		Hike
		Rating % of base Salary as variable pay Bonus
		> =4 15 1500
		>=3 && < 4 10 1200
		< 3 3 300

		Extra Perks
		Employees with Experience >= 5 Years get extra Reward of 5000;

		There are 5 Employee records. Now Calculate the Hike percentage of each Employee and store the
		Values in Map with EmployeeName and HikePercentagevalue and Print them.

		Hike = ( Base Salary * variable pay % ) + Bonus+Reward ;
		Hike % = Hike / Base Salary .
		*/
		
		// TODO Auto-generated method stub Map<String,List<Map<String,String >>> data = new HashMap<String,List<Map<String,String >>>();
		
		Map<String,Double[]> empData = new HashMap<String,Double[]>();
		empData.put("Alice Johnson", new Double[]{75000.0, 5.0, 4.2});
		empData.put("Bob Smith", new Double[]{68000.0, 3.0, 3.8});
		empData.put("Carol Davis", new Double[]{82000.0, 7.0, 4.5});
		empData.put("David Brown", new Double[]{90000.0, 10.0, 2.0});
		empData.put("Eva Green", new Double[]{60000.0, 2.0, 3.5});
		Map<String,Double> result = new HashMap<String,Double>();
		for (Map.Entry<String, Double[]> entry : empData.entrySet()) {
			String key = entry.getKey();
			Double[] val = entry.getValue();
			Double rating = val[2];
			Double variablePay= 0.0,Reward= 0.0,Hike= 0.0,Bonus = 0.0,HikePercentage=0.0;
			Double BaseSalary = val[0];
			Double Experiance = val[1];
			if(rating>=4) {
				variablePay = 15.0;
				Bonus = 1500.0;
			}
			else if(rating>=3 && rating< 4) {
				variablePay = 10.0;
				Bonus = 1200.0;  
			}
			else if(rating < 3) {
				variablePay = 3.0;
				Bonus = 300.0;  
			}
			if(Experiance>=5) {
				Reward=5000.0;
			}
			Hike = ( BaseSalary * variablePay / 100 ) + Bonus + Reward ;
			HikePercentage = Hike / BaseSalary;
			result.put(key, HikePercentage);
		}
		System.out.println(result);
		
		
	}

}
