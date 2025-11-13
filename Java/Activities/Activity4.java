package com.activities;

import java.util.Arrays;
import java.util.Scanner;

public class Activity4 {

	public static void main(String[] args) {
		
		 Scanner s=new Scanner(System.in);
		 System.out.print("Enter the size of the array");
		 int size = s.nextInt();
		 int[] mydata=new int[size];
		 int i;
		 for(i=0; i<mydata.length; i++){
			 System.out.print("Enter the number " +(i+1) + ":");
			 mydata[i]=s.nextInt();
		 }
		 
		System.out.println("Before storting: ");	 
		displayData(mydata);
		System.out.println();
		Arrays.sort(mydata);
		System.out.println("After storting: ");	
		displayData(mydata);
		s.close();
		 }

		private static void displayData(int[] mydata)
		{
			for (int temp:mydata)
			{
				System.out.print(temp);
			}
		}
		
}
