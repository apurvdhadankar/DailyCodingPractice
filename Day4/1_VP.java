package com.arrays.Day_4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Find common elements in three sorted arrays
public class CommonElementsInArray {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 4, 7, 8, 9 };
		int brr[] = { 2, 3, 4, 5, 7, 9 };
		int crr[] = { 1, 2, 4, 7, 8, 9 };

		findCommanElements(arr, brr, crr);
	}

	// Simple for loop technique.
	private static void findCommonElements(int arr[], int brr[], int crr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < arr.length; k++) {
					if (arr[i] == brr[j] && brr[j] == crr[k]) {
						System.out.println(arr[i]);
					}
				}
			}
		}
	}

	// Using Hashset technique, used filter for validate common elements.
	private static void findCommanElements(int arr[], int brr[], int crr[]) {
		Set<Integer> brrSet = new HashSet<>();
		Set<Integer> crrSet = new HashSet<>();

		// Adding elements of brr and crr to their respective sets
		Arrays.stream(brr).forEach(brrSet::add);
		Arrays.stream(crr).forEach(crrSet::add);

		// Finding common elements with arr
		Arrays.stream(arr).filter(no -> brrSet.contains(no) && crrSet.contains(no)).forEach(System.out::println);
	}
}
