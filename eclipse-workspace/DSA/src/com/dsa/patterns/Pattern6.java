package com.dsa.patterns;

import java.util.Scanner;

public class Pattern6 {
	/*
	      * 
	    * * 
	  * * * 
	* * * *


		*/
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int n= in.nextInt();
		
		for(int row=1; row<=n; row++) {
			
			for(int col=1; col<=n; col++) {
				
				if(row+col<=n) {
					System.out.print(" "+" ");
				}else
					System.out.print("* ");
				
			}
			System.out.println();
		}
		
		
		
		
	}

}
