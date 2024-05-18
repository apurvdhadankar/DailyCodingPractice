package arrays;

import java.util.HashMap;
import java.util.Map;

public class FindPairWhoseSumEqualToK {

	public static void main(String[] args) {
		/*
		 * Input: arr[] = {1, 5, 7, -1}, K = 6 Output: 2 Explanation: Pairs with sum 6
		 * are (1, 5) and (7, -1). Input: arr[] = {1, 5, 7, -1, 5}, K = 6 Output: 3
		 * Explanation: Pairs with sum 6 are (1, 5), (7, -1) & (1, 5).
		 */

		int[] a = {1, 5, 7, -1};
		findPair(a, 6); // O(n^2)
		
		printPairs(a, a.length, 6);
		
		 Map<Integer, Integer> map = new HashMap<>();
		 map.put(2, 3);
		 System.out.println(map.getOrDefault(1, 5));
	}

	static void printPairs(int[] arr, int n, int sum)
	{
        // Store counts of all elements in map m
        Map<Integer, Integer> m = new HashMap<>();

        // Traverse through all elements
        for (int i = 0; i < n; i++)
        {
            // Search if a pair can be formed with arr[i].
            int rem = sum - arr[i];
            if (rem == arr[i])
            {
                // Check if the complement is in the map and occurs only once
                if (m.containsKey(rem) && m.get(rem) == 1) 
                {
                    System.out.println("(" + rem + ", " + arr[i] + ")");
                }
            } 
             if (m.containsKey(rem) && !m.containsKey(arr[i]))
            {
                // Check if the complement is in the map and the current element is not in the map
                System.out.println("(" + rem + ", " + arr[i] + ")");
            }
            m.put(arr[i], m.getOrDefault(arr[i], 0) + 1); // Update the map with the current element's count
        }
    }

	private static void findPair(int[] a, int K) 
	{
		int cnt = 0;
		for (int i=0; i<a.length; i++)
		{
			for (int j=i+1; j<a.length; j++)
			{
				if (a[i] + a[j] == K)
				{
					System.out.println(a[i] +" " +a[j]);
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
	}

}
