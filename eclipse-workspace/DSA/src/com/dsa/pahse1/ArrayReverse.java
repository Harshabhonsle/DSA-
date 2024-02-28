package com.dsa.pahse1;

import java.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args) {
		
		int[] arr= {1,3,16,99,5,7};
		
		
		System.out.println(Arrays.toString(arr));
		
		reverse(arr);

		
		System.out.println(Arrays.toString(arr));
		

	}

	  static int[] reverse(int[] arr) {
		  int start= 0;
		  int end = arr.length-1;
		  
		  while(start < end) {
			  
			  swap(arr,start, end);
			  
			  start++;
			  end--;
		  }
		  
		  return arr;
		  
		  
	}

	static int[] swap(int[] arr, int start, int end) {
		
		 int temp = arr[start];
		 arr[start] = arr[end];
		 arr[end] = temp;
		 
		 return arr;
		
	}
	

}
