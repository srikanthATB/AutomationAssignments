package com.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Assignment5ArraysCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Create a list of the top 5 most populated countries
        List<String> countries = new ArrayList<>();
        countries.add("China");
        countries.add("India");
        countries.add("United States");
        countries.add("Indonesia");
        countries.add("Pakistan");

        // Print the 2nd country (India)
        System.out.println("The 2nd most populated country is: " + countries.get(1));
        
        // Create a set of the top 10 most visited tourist attractions
        Set<String> touristAttractions = new HashSet<>();
        touristAttractions.add("Eiffel Tower, Paris");
        touristAttractions.add("Great Wall of China");
        touristAttractions.add("Louvre Museum, Paris");
        touristAttractions.add("Colosseum, Rome");
        touristAttractions.add("Statue of Liberty, USA");
        touristAttractions.add("Machu Picchu, Peru");
        touristAttractions.add("Taj Mahal, India");
        touristAttractions.add("Mount Fuji, Japan");
        touristAttractions.add("Christ the Redeemer, Brazil");
        touristAttractions.add("Sydney Opera House, Australia");

        // Print the size of the set
        System.out.println("Number of tourist attractions: " + touristAttractions.size());
        
        
        
        
        // Create a map of the 5 largest cities in the US and their populations
        Map<String, Integer> cities = new HashMap<>();
        cities.put("New York", 8419600);
        cities.put("Los Angeles", 3980400);
        cities.put("Chicago", 2716000);
        cities.put("Houston", 2328000);
        cities.put("Phoenix", 1690000);

        // Print the map
        System.out.println("Cities and their populations: " + cities);
        
        
     // Create an array of 10 random integers
        int[] numbers = new int[10];
        Random random = new Random();
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);  // Random number between 0 and 99
        }

        // Print out the sum of the 3rd and 5th value
        int sum = numbers[2] + numbers[4];
        System.out.println("Sum of 3rd and 5th values: " + sum);
        
        
     // Create a list of the top 5 highest-grossing movies
        List<String> topMovies = new ArrayList<>();
        topMovies.add("Avatar");
        topMovies.add("Avengers: Endgame");
        topMovies.add("Titanic");
        topMovies.add("Star Wars: The Force Awakens");
        topMovies.add("Avengers: Infinity War");

        // Print the third movie on the list (Titanic)
        System.out.println("The third highest-grossing movie is: " + topMovies.get(2));
        

	}

}
