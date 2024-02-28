package com.dsa.searching;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// linear seach searches from the start till the end until the target element is found
		// The big O notation for linear search is o(n)
		// As the size of the array increases by n, the no of operations to search a element also increases by n
		
		
		int[] arr = {84, 43, 27, 18, 23, 65};
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("enter the element you want to find:");
		int target = in.nextInt();
		
		
		System.out.println(linearSearch(arr,target));
		
		
	}

	 static String linearSearch(int[] arr, int target) {

		 for(int i=0; i<arr.length; i++) {
			 
			 if(arr[i]==target)
				 return "element found at: "+i;
			 
		 }
		 
		 return "element not found";
		 
	}
}
