package com.arrays.Day_4;

// Subarrays with equal 1s and 0s
public class SubarrayWithEqualOnesAndZeros {

	public static void main(String[] args) {
		int arr[] = { 0, 0, 1, 0, 1, 0 };

		int cnt = countSubarrayWithEqualOnesAndZaro(arr);
		System.out.println("Count of 1s and 0s is: " + cnt);
	}

	// Simple for loop technique and comparing the 1s and 0s.
	private static int countSubarrayWithEqualOnesAndZaro(int arr[]) {
		int cnt = 0;

		for (int i = 0; i < arr.length; i++) {
			int zeros = 0, ones = 0;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] == 0) {
					zeros++;
				} else {
					ones++;
				}

				if (zeros == ones) {
					cnt++;
					// Printing the subarrays
					System.out.println(arr[i] + "," + arr[j]);
				}
			}
		}
		return cnt;
	}
}
