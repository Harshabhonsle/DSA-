package com.dsa.patternexercise;

import java.util.Scanner;

public class Pattern7 {
	
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
			
			
	/*		if(row>n)
				 space = row-n;
			else
				space = n-row;*/
			
			int totalSpace = row>n ? row-n : n-row;
			
			for(int space=1; space<=totalSpace; space++) {
				
				System.out.print(" ");
			}
			
			int totalCol =  row>n ? 2*n-row : row;

			for(int col=1; col<=totalCol; col++) {
				
				System.out.print("* ");
						
			}
			
			System.out.println();
			
		}
	
	}

}
