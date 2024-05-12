package com.arrays;

import java.util.Arrays;

// cyclically rotate an array by one
public class RotateAarrayByOne {

	public static void main(String[] args) {
		int arr[] = { 5, 2, 7, 8, 3, 1 };

		rotateArrayByOne(arr);

		System.out.println(Arrays.toString(arr));
	}

	public static void rotateArrayByOne(int[] arr) {
		int temp = arr[arr.length - 1];
		// shifting elements to the right by one position
		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		// put the last element at the beginning of the array
		arr[0] = temp;
	}
}
