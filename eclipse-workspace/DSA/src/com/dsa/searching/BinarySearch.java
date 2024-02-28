package com.dsa.searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	//note: array need to be sorted in ascending
	// 1. find the middle element
	// 2. if the target greater than middle , then consider the right part only and make the start as mid+1
	// 3. id the target lesser than middle ,then consider the left part and make the end as mid-1
	// 4. if middle == target, then the element is found
	
	// the bog o notation for binary search is o(log n)
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int[] arr = {45, 84, 9, 94, 87, 52, 31, 8};
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Enter the element you want to find: ");
		
		int target = in.nextInt();
		
		System.out.println(binarySearch(arr,target));
		
		
		
		
	}

	 static String binarySearch(int[] arr, int target) {

		 int start = 0;
		 int end = arr.length-1;
		 
		 while(start<=end) {
			 
			 int mid = (start+end)/2;
			 
			 if(target == arr[mid]) {
				 return "The element found at: "+mid;
			 }
			 else if(target>arr[mid]) {
				 start = mid+1;
				 
			 }
			 else if(target<arr[mid]) {
				 end = mid-1;
				
			 }
			 
		 }
		 
		 return "The element not found";
		 
	}

}
