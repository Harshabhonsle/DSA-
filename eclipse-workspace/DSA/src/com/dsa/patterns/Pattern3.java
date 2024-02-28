package com.dsa.patterns;

import java.util.Scanner;

public class Pattern3 {
/*
			* * * * * 
			* * * * 
			* * * 
			* * 
			* 
 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n= in.nextInt();
		
		for(int row=0; row<n; row++) {
			for(int col=0; col<n-row; col++) {
				
				System.out.print("* ");
				
			}
			System.out.println();
		}
		
	}

}
