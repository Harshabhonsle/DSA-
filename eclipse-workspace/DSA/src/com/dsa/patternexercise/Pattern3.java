package com.dsa.patternexercise;

import java.util.Scanner;

public class Pattern3 {
	/*
	  				1 
					2 2 
					3 3 3 
					4 4 4 4 
					5 5 5 5 5 
	 */

	public static void main(String[] args) {

		Scanner in= new Scanner(System.in);
		
		int n = in.nextInt();
		int a=1;
		
		for(int row=1; row<=n; row++) {
			
			for(int col=1; col<=row; col++) {
				
				System.out.print(a+" ");
				
				
			}
			a++;
			System.out.println();
		}
		
		
		
		
	}

}
