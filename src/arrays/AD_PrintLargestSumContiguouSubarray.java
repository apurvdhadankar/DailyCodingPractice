package arrays;

public class AD_PrintLargestSumContiguouSubarray {

	public static void main(String[] args) {
		int[] a = {-2, -3, 4, -1, -2, 1, 5, -3}; // {1, 2, -3, 4, -5, 7, 8, 5};
		int maxSum = printMaxSubArraySum(a);
		System.out.println("\n Max sub array addition is -> " + maxSum);

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

	private static int printMaxSubArraySum(int[] a) 
	{
		int maxSoFar = Integer.MIN_VALUE, max = 0;
		int start = 0, s = 0, ei = 0;
		
		for (int i=0; i<a.length; i++)
		{
			max = max + a[i];
			
			if (maxSoFar < max)
			{
				maxSoFar = max;
				start = s;
				ei = i;
			}
			
			if (max < 0)
			{
				max = 0;
				s = i+1;
			}
		}
		System.out.println("Starting index " + start);
        System.out.println("Ending index " + ei);
		for (int i=start; i<=ei; i++)
		{
			System.out.print(a[i] +" ");
		}
		return maxSoFar;
	}

}
