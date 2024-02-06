package com.lambda.expression;

import java.util.Arrays;

public class Example2 {

	public static void main(String[] args) {
		
		
		int arr[] = {1,2,5,6,8,2,3};
		
		for(int i = 0; i<arr.length;i++) {
			
			for(int j = i+1; j<arr.length;j++) {
				
				if(arr[i]<arr[j]) {
					
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
				
			}
		}
		System.out.println(Arrays.toString(arr));
		
		String result = "";
		for(int i =0; i<arr.length; i++) {
			result = result + arr[i];
		}
		System.out.println("Last data");
		System.out.println(result);
	}
	
}
