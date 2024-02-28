package com.dsa.pahse1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMaxInRange {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int[] arr = {3,5,9,2,69,3,7};
		
		System.out.println("Enter the indexes of the elements btw which you want to find max:");
		  int start = in.nextInt(); 
		  int end = in.nextInt();
		 
		System.out.println(Arrays.toString(arr));
		
		System.out.println(maxInRange(arr,start,end));
		

	}
	static int maxInRange(int[] arr, int start, int end) {

		 int  maxValue = start;
		 
		 for(int i=0; i<= end ; i++) {
			 if(arr[i] > maxValue) {
				 
				 maxValue = arr[i];
			 }
		 }
		return maxValue;
	}
}
