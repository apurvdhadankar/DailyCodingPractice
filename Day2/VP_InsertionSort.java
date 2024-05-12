package com.arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = { 5, 2, 7, 8, 3, 1 };
		int i = 0, j = 0, no = 0;

		// without using swapping
		for (i = 1; i < arr.length; i++) {
			no = arr[i];
			for (j = i; (j > 0) && (arr[j - 1] > no); j--) {
				arr[j] = arr[j - 1];
			}
			arr[j] = no;
		}

		// with using swapping
		for (i = 1; i < arr.length; i++) {
			for (j = i - 1; j >= 0; j--) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		for (i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
