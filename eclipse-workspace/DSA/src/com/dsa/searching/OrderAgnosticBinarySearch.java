package com.dsa.searching;

import java.util.Scanner;

public class OrderAgnosticBinarySearch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		/*
		 * 1. if we don't know how the array is sorted i.e if the array is in ascending
		 * or descending order 2. Find whether the array is asc or des by comparing
		 * first and the last element 3. then regarding to that create the condition
		 * statement
		 */
		
		int[] arr = {90, 84, 59, 44, 31, 17, 12, 8, -1, -8, -14};
		
		System.out.println("Enter the element you want to find: ");
		int target = in.nextInt();
		
		String res = orderAgnosticBS(arr,target);
		
		System.out.println(res);
		
		
	}

	 static String orderAgnosticBS(int[] arr, int target) {
		 
		 int start = 0;
		 int end = arr.length-1;
		 
		 boolean isAsc = arr[0]<arr[end];
		 
			 while(start<=end) {
				 
				 if(isAsc) {
					 int mid = (start+end)/2;
					 
					 if(target == arr[mid]) {
						 return "The element found at: "+mid;
					 }
					 if(target>arr[mid]) {
						 start = mid+1;
						 
					 }
					  else {
						 end = mid-1;
						
					 }
				 }else {
					 int mid = (start+end)/2;
					 
					 if(target == arr[mid]) {
						 return "The element found at: "+mid;
					 }
					 if(target<arr[mid]) {
						 start = mid+1;
						 
					 }
					 else {
						 end = mid-1;
						
					 } 
				 }
		 }
		 
		return "Element not found";
	}

}
