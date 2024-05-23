package arrays;

public class KadanesAlgo {

	public static void main(String[] args) {
		/*
		 * Input: arr = {-2,-3,4,-1,-2,1,5,-3} Output: 7 Explanation: The subarray
		 * {4,-1, -2, 1, 5} has the largest sum 7.
		 * 
		 * 
		 * Algo:
		 * 
		 * MAX_SO_FAR = Integer.MIN_VALUE; max_ending_here = 0 Loop for each element of
		 * the array
		 * 
		 * (a) max_ending_here = max_ending_here + a[i] 
		 * (b) if(max_so_far < * max_ending_here) max_so_far = max_ending_here 
		 * (c) if(max_ending_here < 0)
		 * max_ending_here = 0 
		 * return max_so_far
		 */
		
		int[] arr = {-2,-3,4,-1,-2,1,5,-3};
		
		System.out.println(maxSum(arr));
	}

	private static int maxSum(int[] arr) 
	{
		int maxSoFar = Integer.MIN_VALUE;
		int maxEndingHere = 0;
		int start = 0, end = 0, s = 0;
		
		for (int i=0; i<arr.length; i++)
		{
			maxEndingHere = maxEndingHere + arr[i];
			if (maxSoFar < arr[i])
			{
				maxSoFar = maxEndingHere;
				start = s;
				end = i;
			}
			
			if (maxEndingHere < 0)
			{
				maxEndingHere = 0;
				s = i+1;
			}
		}
		
		for (int i=start; i<=end; i++)
		{
			System.out.print(arr[i] +" ");
		}
		System.out.println();
		return maxSoFar;
		
	}

}
