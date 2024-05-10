package com.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

// Reverse the array
public class ReverseArray {

	public static void main(String[] args) {
		int arr[] = {1,8,2,7,3,6};

		for(int i = arr.length-1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
		
		// Using Java 8 features to reverse the array
		int[] revArray = IntStream.range(0, arr.length)
                .map(i -> arr[arr.length - 1 - i])
                .toArray();
		
		// printing the reverse array
		Arrays.stream(revArray).forEach(System.out::println);
	}
}
