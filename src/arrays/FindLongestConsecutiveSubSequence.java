package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindLongestConsecutiveSubSequence {

	public static void main(String[] args) {
		// int[] nums = {100, 4, 200, 1, 3, 2};
		// System.out.println(longestConsecutive(nums)); // Output: 4
		// Explanation: The longest consecutive subsequence is {1, 2, 3, 4}, and its length is 4.
		
		int[] a = {100, 4, 200, 1, 3, 2, -2, 5};
		int[] b= Arrays.copyOf(a, a.length);
		
		findLongestCnsecutiveSubSequence(a); // O(nlogn) Time to sort the array is O(Nlog(N)).
		
		findLongestConsecutiveSubSequenceUsingHashing(b);
		

	}
 
	private static void findLongestConsecutiveSubSequenceUsingHashing(int[] b)
	{
		System.out.println(Arrays.toString(b));
		Set<Integer> set = new HashSet<Integer>();
		
		for (int n : b)
		{
			set.add(n);
		}
		int cnt = 0;
		for (int i=0; i<b.length; ++i)
		{
			// checking if set not contains b[i]-1 to find starting point of subsequence
			if (!set.contains(b[i] -1))
			{
				int num = b[i];
				while (set.contains(num))
				{
					num++;
				}
				
				if (cnt < num - b[i])
				{
					cnt = num - b[i];
				}
			}
		
		}
		
		System.out.println("Using hashSet -> " + cnt);
		
	}

	private static void findLongestCnsecutiveSubSequence(int[] a)
	{
		Arrays.sort(a);
		
		// To eliminate the duplicate elements
		List<Integer> list = new ArrayList<Integer>();
		list.add(a[0]);
		for (int i=1; i<a.length; i++)
		{
			if (a[i] != a[i-1])
			{
				list.add(a[i]);
			}
		}
		
		int count = 0;
		
		System.out.println(list);
		for (int i=0; i<list.size(); i++)
		{
			if (i > 0 && list.get(i) == list.get(i - 1) + 1)
			{
				count++;
			}
		}
		
		System.out.println(count+1);
	}

}
