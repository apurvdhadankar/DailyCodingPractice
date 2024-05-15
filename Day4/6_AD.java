package arrays;

import java.util.HashMap;
import java.util.Map;

public class CountPairsWithTheGivenSum {

	public static void main(String[] args) {
		/*
		 * Example: Input: Array: [1, 2, 3, 4, 5] Target sum: 6(How much elements can
		 * for 6 in pair)
		 * 
		 * Output: 2
		 * 
		 * Explanation: There are two pairs in the array that sum up to 6: (1, 5) and
		 * (2, 4).
		 */
		
		int[] a = {1, 2, 3, 4, 5};
		System.out.println("-> " +countPairs(a, 6)); // O(n^2)
		
		System.out.println("-> " + usingHashing(a, 6)); // O(n) space : O(n)

	}

	private static int countPairs(int[] a, int target)
	{
		int count = 0;
		for (int i=0; i<a.length; i++)
		{
			for (int j=i+1; j<a.length; j++)
			{
				if ((a[i] + a[j] == target))
				{
					System.out.print("(" + a[i] +" "+ a[j]+ ") ");
					count++;
				}
			}
		}
		
		return count;
	}

	private static int usingHashing(int[] a, int target) 
	{
		// [1, 2, 3, 4, 5]
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int count = 0;
		
		for (int i=0; i<a.length; i++)
		{
			// Check if (target – a[i]) is present in the map, 
			// if present then increment the count variable by its frequency.
			if (map.containsKey(target - a[i])) // 6 - 4 = 2, // 6 - 5 = 1
			{
				count = count + map.get(target - a[i]);
			}
			if (map.containsKey(a[i]))
			{
				map.put(a[i], map.get(a[i])  + 1);
			}
			
			else
			{
				map.put(a[i], 1);
			}
		}
		return count;
	}
}
