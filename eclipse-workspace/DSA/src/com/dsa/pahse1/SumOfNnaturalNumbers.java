package com.dsa.pahse1;

import java.util.Scanner;

public class SumOfNnaturalNumbers {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(basicSum(n));
		//SSystem.out.println(sum(n));
	}
	public  static int basicSum(int n) {
		int sum=0;
		for(int i=0;i<=n;i++) { //this approach take more time to process large numbers as it has to iterate through all the numbers from 0
			sum = sum + i;
		}
		return sum;
	}
	public static int  sum(int n) {
		int sum= n*(n+1)/2;   
		return sum;
	}
}
