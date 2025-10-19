package com.activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {

	public static void main(String[] args) {
		
		List<String> myList = new ArrayList<>();
		myList.add("Java");
		myList.add("Automation");
		myList.add("API");
		myList.add("python");
		myList.add("Cloud");
		
		// printing all the list
		for (String name : myList) {
			System.out.println(name);
		}
		
		System.out.println("3rd element in the list is "+ myList.get(2));
		System.out.println("Is AI present in the arraylist "+ myList.contains("AI"));
		System.out.println("size of arraylist is "+ myList.size());
		System.out.println("removing 4th item in arraylist "+ myList.remove(3));
		System.out.println("size of latest arraylist is "+ myList.size());
		
	}

}
