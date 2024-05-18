package arrays;

public class FindAPairWhoseSumClosestToX {

	public static void main(String[] args) {
		/*
		 * Input: arr[] = {10, 22, 28, 29, 30, 40}, x = 54 Output: 22 and 30 Input:
		 * arr[] = {1, 3, 4, 7, 10}, x = 15 Output: 4 and 10 Naive Approach:- A simple
		 * solution is to consider every pair and keep track of the closest pair (the
		 * absolute difference between pair sum and x is minimum). Finally, print the
		 * closest pair. The time complexity of this solution is O(n2)
		 */

		int a[] = {10, 22, 28, 29, 30, 40};
		
		findAPairWhoseSumClosestToXUsingTwoPointers(a, 54); //O(n)
	}

	private static void findAPairWhoseSumClosestToXUsingTwoPointers(int[] a, int x) 
	{
		int l = 0, r = a.length-1;
		int sum = Integer.MAX_VALUE;
		int i =0, j = 0;
		while (l < r)
		{
			
			if (Math.abs(a[l] + a[r] - x) < sum)
			{
				i = l;
				j = r;
				sum = Math.abs(a[l] + a[r] - x);
			}
			
			if (a[l] + a[r] > x)
			{
				r--;
			}
			else
			{
				l++;
			}
		}
		
		System.out.println(a[i] +" " + a[j]);
		
	}

}
