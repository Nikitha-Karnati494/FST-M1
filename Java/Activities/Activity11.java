package com.activities;

import java.util.HashMap;

public class Activity11 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(1, "orange");
		hm.put(2, "green");
		hm.put(3, "blue");
		hm.put(4, "black");
		hm.put(5, "white");
		
		System.out.println("original hash map is "+hm);
		
		System.out.println("removing orange color "+hm.remove(1));
		
		if(hm.containsValue("green")) {
			System.out.println("green exists in hash map");
		}
		else {
			System.out.println("green not exists in hash map");
		}
		
		System.out.println("Updated hash map size is "+hm.size());
		
	}

}
