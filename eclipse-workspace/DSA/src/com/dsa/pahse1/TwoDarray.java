package com.dsa.pahse1;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDarray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		//1.
		
		int[][] arr = new int[3][3];
		System.out.println(arr.length);
		
		arr[0][0] =1;
		arr[0][1] =2;
		arr[0][2] =3;
		
		arr[1][0] =4;
		arr[1][1] =5;
		arr[1][2] =6;
		
		arr[2][0] =7;
		arr[2][1] =8;
		arr[2][2] =9;
		
		//2. printing an 2d array
		 
		for(int row=0; row<arr.length; row++) {
			
			for(int col=0; col<arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
		
		
		//using Arrays class
		for(int row=0; row<arr.length; row++) {
			
			System.out.println(Arrays.toString(arr[row]));
		}
		
		System.out.println();
		//using for each loop
		
		for(int[] a:arr) {
			System.out.println(Arrays.toString(a));
		}
	
		
		
		
		/*3. 2d array of variable col length
		{
			{1,2,3},
			{4,5},
			{6,7,8,9}
		}*/
		
		
	
		//input
		
		int[][] x = new int[3][3];
		
		for(int k=0; k<x.length; k++) {
			
			for(int j=0; j<x[k].length; j++) {
				
				x[k][j]= scn.nextInt();
			}
		}
		
		
		for(int z=0; z<x.length; z++) {
			System.out.println(Arrays.toString(x[z]));
		}
		
		
		int[][] arr1 = {
				{1, 2, 3},
				{4, 5},
				{6, 7, 8, 9}
		};	
		//output
		
		for(int ro=0; ro<arr1.length; ro++) {
			
			for(int co=0; co<arr1[ro].length; co++) {
					System.out.print(arr1[ro][co]+" ");
			}
			
			System.out.println();
		}
		
		
		
		
		int[][] arr2 = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
				
		};
		
		
		
		
	}

}
