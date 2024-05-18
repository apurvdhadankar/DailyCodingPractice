package arrays;

public class MinimumSpasRequiredToBringElementsLessThanEqulsToK {

	public static void main(String[] args) {
		/*
		 * Input: Array = [2, 1, 5, 6, 3], K = 3 Explanation: To bring elements less
		 * than or equal to 3 together, we need to swap the element 5 with the element
		 * 3. Thus, the array becomes [2, 1, 3, 6, 5]. Expected Output: Minimum swaps
		 * required = 1
		 */
		
		int[] a = {2, 1, 5, 6, 3};
		int n = a.length;
		
		findMinSwap(a, n, 3);

	}

	private static void findMinSwap(int[] a, int n, int K) 
	{
		int swapWindow = 0;
		for (int i=0; i<n; i++)
		{
			if (a[i] <= K)
			{
				swapWindow++;
			}
		}
		
		int swap = 0, minSwaps = Integer.MAX_VALUE;
		for (int i = 0; i < swapWindow; i++) 
		{
            if (a[i] > K)
                swap++;
        }
		
		minSwaps = Math.min(swap, minSwaps);
		
		for (int i=swapWindow; i<n; i++)
		{
			if (a[i - swapWindow] <= K && a[i] > K)
			{
				swap ++;
			}
			else if (a[i - swapWindow] > K && a[i] <= K)
			{
	            swap--;
			}
			
			minSwaps = Math.min(minSwaps, swap);
		}
		
		System.out.println(minSwaps);
		
	}

}
