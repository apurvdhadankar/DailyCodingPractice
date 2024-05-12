package com.arrays;

// Largest sum contiguous Subarray.
public class MaxSubArraySum {

	public static void main(String[] args) {
		int arr[] = { 5, 2, 7, 8, 3, 1 };

		int SumMaxSubArray = maxSubArraySum(arr);

		System.out.println(SumMaxSubArray);
	}

	public static int maxSubArraySum(int[] arr) {
		// its store maximum sum
		int max = arr[0];
		// current starting index of the max sub array
		int start = arr[0];
		// current ending index of the max sub array
		int end = arr[0];

		// time complexity is O{n) beacause of single loop.
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > end) {
				start = arr[i];
				end = arr[i];
			}
			end += arr[i];

			if (end > max) {
				max = end;
			}
		}

		return max;
	}
}
