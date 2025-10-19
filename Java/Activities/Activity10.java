package com.activities;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		
		HashSet<String> hs=new HashSet<String>();
		hs.add("o");
		hs.add("b");
		hs.add("j");
		hs.add("e");
		hs.add("c");
		hs.add("t");
		
		System.out.println("Original hash set "+hs);
		System.out.println("size of hash set is "+hs.size());
		System.out.println("removing an element "+hs.remove("j"));
		if(hs.remove("z")) {
			System.out.println("z removed from hash set");
		}
		else {
			System.out.println("z is not present in the hash set");
		}
		
		System.out.println("Is a present in hashset "+hs.contains("a"));
		System.out.println("updated hash set "+hs);
		
	}

}
