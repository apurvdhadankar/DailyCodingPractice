package com.arrays;

// In array which consists of only 0,1 and 2 element 
// sort the array without using the sorting algorithm.
public class SortZeorsOnesAndTwos {

	public static void main(String[] args) {
		int arr[] = { 0, 1, 2, 1, 0, 2, 1, 0, 2, 1, 0, 1, 2 };
		int cnt1 = 0, cnt2 = 0, cnt3 = 0, index = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				cnt1++;
			} else if (arr[i] == 1) {
				cnt2++;
			} else if (arr[i] == 2) {
				cnt3++;
			}
		}

		for (int i = 0; i < cnt1; i++) {
			arr[index++] = 0;
		}

		for (int i = 0; i < cnt2; i++) {
			arr[index++] = 1;
		}

		for (int i = 0; i < cnt3; i++) {
			arr[index++] = 2;
		}

		for (int value : arr) {
			System.out.print(value + " ");
		}
	}
}
