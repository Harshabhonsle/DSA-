package com.dsa.patterns;

import java.util.Scanner;

public class HollowPattern1 {

	/*
	 * first row ----> i==0 
	 * last row ----> i = n-1
	 * 
	 * first column ---> j==0 
	 * last column ---> j=n-1
	 * 
	 * left to right diagonal ---> i==j 
	 * right to left diagonal ---> i+j=n-1
	 */
	public static void main(String[] args) {

		Scanner in= new Scanner(System.in);
		int n = in.nextInt();
		
		for(int i=0; i<n; i++ ) {
			
			for(int j=0 ; j<n; j++) {
				
				if(i+j == n-1 || i==j || i==0 || j==0 ||i==n-1 || j==n-1 )
					System.out.print("* ");
				else 
					System.out.print("  ");
				
			}
			System.out.println();
		}
		
		
	}

}
