package com.dsa.patterns;

public class HollowPyramid {

	public static void main(String[] args) {

		int n= 5;
		
		for (int row = 1; row <= n; row++) {
            // Print spaces before the asterisks
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            // Print asterisks
            for (int col = 1; col <= row; col++) {
                if (col == 1 || col == 2 * row - 1 || row == n) {
                    // Print asterisk only in the first column, last column, and last row
                    System.out.print("*");
                } else {
                    // Print spaces for the hollow part
                    System.out.print(" ");
                }
            }

            System.out.println(); // Move to the next line for the next row
        }
		
		
		
		
		
	}

}
