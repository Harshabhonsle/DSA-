package com.dsa.patternexercise;

import java.util.Scanner;

public class pattern6 {
/*
	  			 	* 
			      * * 
			    * * * 
			  * * * * 
			* * * * * 
 */

	public static void main(String[] args) {

		Scanner in= new Scanner(System.in);
		
		int n = in.nextInt();
		
		for(int row=1; row<=n; row++) {
			
			for(int space=1; space<=n-row; space++) {
				
				System.out.print("  ");
			}
			for(int col=1; col<=row; col++) {
				
				System.out.print("* ");
				
			}
			System.out.println();
		}
		
	}

}
