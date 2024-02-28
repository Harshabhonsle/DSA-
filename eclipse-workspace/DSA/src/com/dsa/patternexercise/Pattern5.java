package com.dsa.patternexercise;

import java.util.Scanner;

public class Pattern5 {
	/*
					* 
					* * 
					* * * 
					* * * * 
					* * * * * 
					* * * * 
					* * * 
					* * 
					* 
	 */

	public static void main(String[] args) {

		Scanner in= new Scanner(System.in);
		
		int n = in.nextInt();
		
		for(int row=1; row<2*n; row++) {
			
			int totalCol =  row>n ? 2*n-row : row;
			
			for(int col=1; col<=totalCol; col++) {
				
				System.out.print("* ");
				
				
			}
			System.out.println();
			
			
			
		}
		
		
		
		
		
		
	}

}
