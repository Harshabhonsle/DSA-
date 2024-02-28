package com.dsa.pahse1;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDsa {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		//creating array using new keyword
		int[] arr= new int[5];
		int[] arr2= {1,2,3,4,5};
		
		arr[0]=1;   		//initializing array indexes which is time consuming
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		// initializing using for loop
		for(int t=0; t<arr.length; t++) {    
			arr[t]=in.nextInt();
		}
		
		System.out.println(arr[3]);		//printing or accessing array values
		System.out.println(arr[1]);
		
		//reinitialising array values
		arr[0]=99;
		System.out.println(arr[0]);
		
		//printing methods of array
		//1.Using simple for loop
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//2. using for each loop (enhanced for loop)
		
		for(int element:arr) {
			System.out.println(element);
		}
		
		//3. using Arrays class method
		
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
	}

}
