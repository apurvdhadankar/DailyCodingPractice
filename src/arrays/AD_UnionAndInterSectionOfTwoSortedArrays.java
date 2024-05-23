package arrays;

import java.util.HashSet;
import java.util.Set;

public class AD_UnionAndInterSectionOfTwoSortedArrays {

	public static void main(String[] args) {
//		int[] a = {1, 3, 4, 5, 7, 9, 11};
//		int[] b = {2, 4, 6, 7, 8, 10};
		
		int[] a = {4, 9, 5};
		int[] b = {9,4,9,8,4};
		// op: Union-> 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11
		// Intersection: 4, 7
		printUnionAndIntersection(a, b); // two pointers O(a + b)
		
		printUnionAndIntersectionUsingSet(a, b); // Time & space O(a + b)

	}
	
	private static void printUnionAndIntersectionUsingSet(int[] a, int[] b) 
	{
		
		Set<Integer> set = new HashSet<Integer>();
		for (int i : a)
			set.add(i);
		
		for (int i : b)
			set.add(i);
		
		System.out.println("\nUnion -> "+set );
		
		Set<Integer> interSections = new HashSet<Integer>();
		for (int i : a)
			interSections.add(i);
		
		System.out.print("InterSection: ");
		for (int i : b)
		{
			if (interSections.contains(i))
			{
				interSections.remove(i);
				 System.out.print(i + " ");
			}
		}
	}

	private static void printUnionAndIntersection(int[] a, int[] b)
	{
		int i=0, j=0;
		System.out.print("Union: ");
		while (i < a.length && j < b.length)
		{
			if (a[i] < b[j])
				System.out.print(a[i++] + " ");
			else if (a[i] > b[j])
				System.out.print(b[j++] + " ");
			else
			{
				// If both are same print any one of them and increment both
				System.out.print(a[i++] + " ");
				j++;
			}
		}
		
		while (i < a.length)
		{
			System.out.print(a[i++] + " ");
		}
		
		while (j < b.length)
		{
			System.out.print(b[j++] + " ");
		}
		
		i=0;
		j=0;
		System.out.print("\nIntersection: ");
		while (i < a.length && j < b.length)
		{
			if (a[i] < b[j])
				i++;
			else if (a[i] > b[j])
				j++;
			else
			{
				// If both are same print any one of them and increment both
				System.out.print(a[i++] + " ");
				j++;
			}
		}
	}

}
