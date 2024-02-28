package com.dsa.pahse1;

import java.util.Arrays;

public class BuySellStockMaxProfit {

	public static void main(String[] args) {
		
		//array of stocks price for 6 days
		int[] arr = {7, 1, 5, 3, 6, 4};
		
		//maximum profit 
		System.out.println("The maximum profit is:"+maxProfit(arr));
		
		//on what days maximum profit can be obtained
		System.out.println(Arrays.toString(profitableDays(arr)));
		
	}

	  static int[] profitableDays(int[] arr) {

		  int min = Integer.MAX_VALUE;
		  int max = 0;
		  int buyDay = 0;
		  int sellDay = 0;
		  
		  for(int i=0; i<arr.length; i++) {
			  
			  if(arr[i]<min) {
				  min = arr[i];
				  buyDay = i;
			  }
			  
			  if( arr[i]-min > max) {
				  max = arr[i]-min;
				  sellDay =i;
			  }
		  }
		  
		  //returns the indexes at which max profit is obtained 
		  //as we want the day of these stocks price we have to add the index values with 1;
		  //so that max profit can be obtained via buying stock at day 2 and selling on day 5
		  return new int[] {buyDay+1, sellDay+1};
		  
	}

	static int maxProfit(int[] arr) {

		 int min = Integer.MAX_VALUE;
		 int max = 0;
		 
		 for(int i=0 ; i<arr.length; i++) {
			 
			 if(arr[i]<min) {
				 min = arr[i];
			 }
			 
			 if(arr[i]-min > max){
				 
				 max = arr[i]-min;
				 
			 }
		 }
		  
		return max;
	}

}
