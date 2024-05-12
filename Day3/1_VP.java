package com.arrays;

import java.util.Arrays;

// Move all the negative element to one side of the array.
public class MoveNegNoOneSide {

	public static void main(String[] args) {
		int arr[] = { 0, -5, -9, 4, 8, -2 };

		int result[] = moveNegativeOneSide(arr);
		System.out.println(Arrays.toString(result));
	}

	private static int[] moveNegativeOneSide(int[] arr) {
		int brr[] = new int[arr.length];
		int neg = 0, pos = arr.length - 1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				brr[neg++] = arr[i];
			} else {
				brr[pos--] = arr[i];
			}
		}
		return brr;
	}
}
