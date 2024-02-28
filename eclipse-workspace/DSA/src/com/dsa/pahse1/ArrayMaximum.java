package com.dsa.pahse1;

import java.util.Arrays;

public class ArrayMaximum {

	public static void main(String[] args) {

		int[] arr = {3,5,9,2,69,3,7};
		
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println(max(arr));
		
		
		
			  
		}
	static int max(int[] arr) {

		  int maxValue =arr[0];
		  for(int i=0; i<arr.length; i++) {
			  if(arr[i] > maxValue) {
				  maxValue = arr[i];
			  }
		  }
		  
		  return maxValue;

	}

}
