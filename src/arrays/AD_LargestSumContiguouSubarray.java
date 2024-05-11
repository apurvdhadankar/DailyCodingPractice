package arrays;

public class AD_LargestSumContiguouSubarray {

	public static void main(String[] args) {
		int[] a = {1, 2, -3, 4, -5, 7, 8};
		int maxSum = maxSubArraySum(a);  // O(N)
		System.out.println(maxSum);

	}

	/*
	 * Pseudocode of Kadane’s algorithm: Initialize: max_so_far = INT_MIN
	 * max_ending_here = 0
	 * 
	 * Loop for each element of the array
	 * 
	 * (a) max_ending_here = max_ending_here + a[i] (b) if(max_so_far <
	 * max_ending_here) max_so_far = max_ending_here (c) if(max_ending_here < 0)
	 * max_ending_here = 0 return max_so_far
	 */
	private static int maxSubArraySum(int[] a)
	{
		int maxSoFar = Integer.MIN_VALUE; int maxSum = 0;
		for (int i=0; i<a.length; i++)
		{
			maxSum = maxSum + a[i];
			
			if (maxSoFar < maxSum)
			{
				maxSoFar = maxSum;
			}
			
			if (maxSum < 0)
			{
				maxSum = 0;
			}
		}
		return maxSoFar;
	}

}
