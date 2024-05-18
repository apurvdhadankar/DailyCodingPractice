package arrays;

import java.util.HashMap;

public class FIndUniquePairsWIthGivenSum {

	public static void main(String[] args) {
		/*
		 * Given an array of integers, and a number ‘sum’, print all unique pairs in the
		 * array whose sum is equal to ‘sum’.
		 * 
		 * Examples : Input : arr[] = {1, 5, 7, -1, 5}, sum = 6 Output : (1, 5), (7, -1)
		 * Input : arr[] = {2, 5, 17, -1} sum = 7 Output : (2, 5)
		 */

		int[] a = {1, 5, 7, -1, 5};
		findUniquePairs(a, 6);
	}

	private static void findUniquePairs(int[] a, int sum)
	{
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i=0; i<a.length; i++)
		{
			int rem = sum - a[i];
			if (a[i] == rem)
			{
				if (map.containsKey(rem) && map.get(rem) == 1)
				{
					System.out.println(rem +" " + a[i]);
				}
			}
			
			else if (map.containsKey(rem) && !map.containsKey(a[i]))
			{
				System.out.println(rem +" "+ a[i]);
			}
			map.put(a[i], map.getOrDefault(a[i], 0) + 1);
		}
		
	}

}
