package com.arrays;

import java.util.Arrays;

// Kth Max and Min no in Array.
public class KthMaxAndMinArray {

	public static void main(String[] args) {
		int arr[] = {1,8,2,7,3,6};
		int k = 2;

		Arrays.sort(arr); // 1 2 3 6 7 8

		int kthMax = arr[arr.length - k];
		int kthMin = arr[k - 1];

		System.out.println("Kth Maximum: " + kthMax);
		System.out.println("Kth Minimum: " + kthMin);
	}
}
