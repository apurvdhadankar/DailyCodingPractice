package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindSubarrrayWithSumEqualToZero {

	public static void main(String[] args) {
		int[] a= {4, 2, -3, 1, 6}; // -> n*(n+1)/2 non-empty subarrays/substrings.
		// op: The subarray [2, -3, 1] has a sum equal to zero.
		
		printAllPossibleSubArrays(a); // 0(n^3)
		
		printSubarrrayWithSumEqualToZero(a); // 0(n^3)
		
		System.out.println(findSubArrayWithTwoLoops(a)); // O(n^2)
		 
		System.out.println(subArrayExists(a)); // O (n) space : O(n)

	}

	private static boolean findSubArrayWithTwoLoops(int[] a)
	{
		for (int i=0; i<a.length; i++)
		{
			int sum =  a[i];
			if (sum == 0)
				return true;
			for (int j=i+1; j<a.length; j++)
			{
				sum += a[j];
				if (sum == 0)
				{
					return true;
				}
			}
		}
		return false;
		
	}

	private static void printSubarrrayWithSumEqualToZero(int[] a) 
	{
		List<Integer> list = new ArrayList<Integer>();
		// starting point
		for (int i = 0; i < a.length; i++) 
		{
			// ending point
			for (int j = i; j < a.length; j++) 
			{
				int sum = 0;
				for (int k = i; k <= j; k++) 
				{
					sum = sum + a[k];
					list.add(a[k]);
				}
				if (sum == 0)
				{
					System.out.println("Subarray with sum equal to zero -> "+list);
				}
				else 
				{
					list.removeAll(list);
				}
			}
		}

	}

	private static void printAllPossibleSubArrays(int[] a) 
	{
		//starting point
		for (int i=0; i<a.length; i++)
		{
			// ending point
			for (int j=i; j<a.length; j++)
			{
				// Print subarray between current starting
                // and ending points
				for (int k=i; k<=j; k++)
				{
					System.out.print(a[k] +" ");
				}
				System.out.println();
			}
		}
		
	}
	
	static Boolean subArrayExists(int arr[])
    {
        // Creates an empty hashset hs
        Set<Integer> hs = new HashSet<Integer>();
 
        // Initialize sum of elements
        int sum = 0;
 
        // Traverse through the given array
        for (int i = 0; i < arr.length; i++) {
            // Add current element to sum
            sum += arr[i];
 
            // Return true in following cases
            // a) Current element is 0
            // b) sum of elements from 0 to i is 0
            // c) sum is already present in hash set
            if (arr[i] == 0 || sum == 0 || hs.contains(sum))
                return true;
 
            // Add sum to hash set
            hs.add(sum);
        }
 
        // We reach here only when there is
        // no subarray with 0 sum
        return false;
    }

}
