package arrays;

import java.util.Arrays;

public class AD_MaximumDiffereneceBetewenHeights {

	public static void main(String[] args) {
		// Q. Minimise the maximum difference between heights [V.IMP]
		/*
		 * Given the heights of N towers and a value of K, Either increase or decrease
		 * the height of every tower by K (only once) where K > 0. After modifications,
		 * the task is to minimize the difference between the heights of the longest and
		 * the shortest tower and output its difference.
		 * 
		 * Examples:
		 * 
		 * Input: arr[] = {1, 15, 10}, k = 6 Output: Maximum difference is 5.
		 * Explanation: Change 1 to 7, 15 to 9 and 10 to 4. Maximum difference is 5
		 * (between 4 and 9). We can’t get a lower difference.
		 * 
		 * Input: arr[] = {1, 5, 15, 10}, k = 3 Output: Maximum difference is 8, arr[] =
		 * {4, 8, 12, 7}
		 */

		int[] arr = {1, 5, 15, 10};
		System.out.println("Max difference: " + findTheMaximinDifference(arr, 3));
	}

	// Approach is to increase first element by k and for after all elements decrease by k.
	private static int findTheMaximinDifference(int[] arr, int k) 
	{
		int[] b = Arrays.copyOf(arr, arr.length);
		arr[0] += k;
		for (int i=1; i<arr.length; i++)
		{
			arr[i] -= k;
		}
		
		System.out.println(Arrays.toString(arr));
		
		int maxDifference = Integer.MIN_VALUE;
		for (int i=0; i<arr.length-1; i++)
		{
			int currDiffernce;
			if (arr[i] > arr[i+1])
			{
				currDiffernce = arr[i] - arr[i+1];
			}
			else
			{
				currDiffernce = arr[i+1] - arr[i];
			}
			
			if (maxDifference < currDiffernce)
			{
				maxDifference = currDiffernce;
			}
		}
		return maxDifference;
	}
}
