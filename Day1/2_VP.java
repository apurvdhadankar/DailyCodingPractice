package com.arrays;

import java.util.Arrays;

// Max and Min no in Array.
public class MaxAndMinArray {

	public static void main(String[] args) {
		int arr[] = {1,8,2,7,3,6};
		
		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

			if (arr[i] < min) {
				min = arr[i];
			}
		}

		// Using Java 8 features
		int max1 = Arrays.stream(arr).max().getAsInt();
		int min1 = Arrays.stream(arr).min().getAsInt();

		System.out.println("Max is :" + max1);
		System.out.println("Min is :" + min1);
	}
}
