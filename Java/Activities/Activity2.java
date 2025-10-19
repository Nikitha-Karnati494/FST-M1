package com.activities;

import java.util.Arrays;

public class Activity2 {

	public static void main(String[] args) {
		
//		int[] intarr = new int[6];
//		intarr[0]=10;
//		intarr[1]=77;
//		intarr[2]=10;
//		intarr[3]=54;
//		intarr[4]=-11;
//		intarr[5]=10;
		
		int[] numarray = {10, 77, 10, 54, -11, 10};
		System.out.println("Original Array is ");
		
		for (int i=0;i<=numarray.length-1;i++) {
			System.out.print(numarray[i]+" ");
		}
		
		
		int searchNum=10;
		int fixedSum=30;
		
		System.out.print("Result is "+ result(numarray, searchNum, fixedSum));
	}	
	
		public static boolean result(int[] numbers, int searchNum, int fixedSum) {
			int tempsum=0;
			for (int number: numbers) {
				if(number==searchNum) {
					tempsum+=searchNum;
				}
			if(tempsum > fixedSum) {	
				break;
			}
			}
			
			return tempsum == fixedSum;	
		}
}
