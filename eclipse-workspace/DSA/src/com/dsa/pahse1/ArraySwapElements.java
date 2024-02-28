package com.dsa.pahse1;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySwapElements {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] arr= {1,3,16,99,5};
		
		System.out.println(Arrays.toString(arr));
		
		
		  System.out.println("Enter the indexes of the elements you want to swap:");
		  int index1 = in.nextInt();
		  int index2 = in.nextInt();
		 
		
		swap(arr, index1, index2);
		
		
		System.out.println(Arrays.toString(arr));

		
}
	
	static int[] swap(int[] arr,int i, int j) {

		 int temp = arr[i];
		 arr[i] = arr[j];
		 arr[j] = temp;
		 
		 return arr;
	}
}