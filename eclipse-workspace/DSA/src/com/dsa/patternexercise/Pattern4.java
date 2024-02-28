package com.dsa.patternexercise;

import java.util.Scanner;

public class Pattern4 {
	/*
	 * 				1 
					1 0 
					1 0 1 
					1 0 1 0 
					1 0 1 0 1
	 */

	public static void main(String[] args) {

		Scanner in= new Scanner(System.in);
		
		int n = in.nextInt();
		
		for(int row=1; row<=n; row++) {
			
			for(int col=1; col<=row; col++) {
				
				if(col%2==0)
					System.out.print("0 ");
				else
					System.out.print("1 ");
				
				
			}
			System.out.println();
		}
		
		
		
	}

}
