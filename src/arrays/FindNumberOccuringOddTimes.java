package arrays;

import java.util.HashMap;
import java.util.Map;

public class FindNumberOccuringOddTimes {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 2, 3, 1, 3};
		
		findNumberOccuringOddTimeUsingHashing(a); // O(n) O(n)
		System.out.println(usingTwoLoops(a)); // O(n^2)
	}

	private static int usingTwoLoops(int[] a)
	{
		for (int i=0; i<a.length; i++)
		{
			int cnt = 0;
			for (int j=0; j<a.length; j++)
			{
				if (a[i] == a[j])
				{
					cnt++;
				}
			}
			
			if (cnt %2 != 0)
			{
				return a[i];
			}
		}
		
		return -1;
	}

	private static void findNumberOccuringOddTimeUsingHashing(int[] a) 
	{
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i : a)
		{
			if (map.containsKey(i))
			{
				map.put(i, map.get(i) + 1);
			}
			else
			{
				map.put(i, 1);
			}
		}
		
		for(Integer i : map.keySet())
		{
			if (map.get(i) % 2 != 0)
			{
				System.out.println(i);
			}
		}
	}

}
