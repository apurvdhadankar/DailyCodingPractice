package arrays;

public class MinimumSwapsRequredSlidingWindow {

	public static void main(String[] args) {
		/*
		 * Minimum swaps required to bring elements less than or equal to K together:
		 * Input: Array = [2, 1, 5, 6, 3], K = 3 Explanation: To bring elements less
		 * than or equal to 3 together, we need to swap the element 5 with the element
		 * 3. Thus, the array becomes [2, 1, 3, 6, 5]. Expected Output: Minimum swaps
		 * required = 1
		 * 
		 * Input:  arr[] = {2, 7, 9, 5, 8, 7, 4}, k = 5
		 *	Output: 2
		 */
		
		int[] a = {4, 7, 9, 5, 8, 7, 2};
		int k = 5;
		
		minSwapsUsingSlidingWindow(a, k);

	}

	private static void minSwapsUsingSlidingWindow(int[] a, int k) 
	{
		// First will count how many elements are <= to K
		int windowSize = 0;
		for (int i=0; i<a.length; i++)
		{
			if (a[i] <= k)
			{
				windowSize++;
			}
		}
		
		System.out.println("WindowSize-> "+ windowSize);
		
		// Will check how many swaps required in first window, which is > K
		int currWindow = 0;
		for (int i=0; i<windowSize-1; i++)
		{
			if (a[i] <= k)
			{
				currWindow++;
			}
		}
		
		// Initialize ans within first window size swaps required
		int ans = windowSize - currWindow;
		System.out.println(ans);
		
		for (int i=windowSize; i<a.length; i++)
		{
			if (a[i] <= k)
			{
				currWindow++;
			}
			if (a[i-windowSize] <= k)
			{
				currWindow--;
			}
			
			ans = Math.min(ans, windowSize-currWindow);
		}
		
		System.out.println(ans);
		
	}

}
