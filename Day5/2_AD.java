package arrays;

public class FindMaximumProductOfSubarray {

	public static void main(String[] args) {
		/*
		 * int[] nums = {2, 3, -2, 4}; 
		 * System.out.println(maxProduct(nums)); 
		 * Output: 6 // Explanation: The maximum product subarray is {2, 3},
		 * and its product is 6.
		 */

		int[] a = {2, 3, -2, 4};
		System.out.println("Max prduct is-> " + findMaxProduct(a));
	}

	private static int findMaxProduct(int[] a)
	{
		int maxProductSoFar = Integer.MIN_VALUE, max = 1, start = 0, end = 0, s = 0;;
		for (int i=0; i<a.length; i++)
		{
			max = max * a[i];
			
			if (maxProductSoFar < max)
			{
				maxProductSoFar = max;
				start = s;
				end = i;
			}
			
			if (max < 0)
			{
				s = i+1;
				max = 0;
			}
		}
		
		System.out.println("Starting index " + start);
        System.out.println("Ending index " + end);
		for (int i=start; i<=end; i++)
		{
			System.out.print(a[i] +" ");
		}
		System.out.println();
		return maxProductSoFar;
	}

}
