package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AD_ArrangePositiveAndNegativeElementsAlternately {

	public static void main(String[] args) {
		/*
		 * Input: arr[] = {1, 2, 3, -4, -1, 4} 
		 * Output: arr[] = {-4, 1, -1, 2, 3, 4}
		 * 
		 * Input: arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8}
		 *  Output: arr[] = {-5, 5, -2, 2, -8, 4, 7, 1, 8, 0}
		 * 
		 */
		
		int[] a = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8} ;
		
		reArrangeElementsAlternately(a); // Time: O( n + n) Space: O(n)
		System.out.println(Arrays.toString(a));

	}

	private static void reArrangeElementsAlternately(int[] a)
	{
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		List<Integer> l2 = new ArrayList<Integer>();
		
		for (int i : a)
		{
			if (i < 0)
			{
				l1.add(i);
			}
			else 
			{
				l2.add(i);
			}
		}
		
		int i = 0, j=0, k=0;
		while (i < l1.size() && j < l2.size())
		{
			a[k++] = l1.get(i++);
			a[k++] = l2.get(j++);
		}
		
		while (i < l1.size())
		{
			a[k++] = l1.get(i++);
		}
		
		while (j < l2.size())
		{
			a[k++] = l2.get(j++);
		}
		
	}

}
