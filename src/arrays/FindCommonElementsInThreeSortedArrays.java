package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindCommonElementsInThreeSortedArrays {

	public static void main(String[] args) {
		int[] a = {1, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] b = {2, 3, 5, 6, 8, 10};
		int[] c = {1, 2, 6, 10, 10};
		
		 usingTwoPointersTechnique(a, b , c);  // Time : O (n) + O (n) + O(n) = O(n1+n2+n3). space O(n)
		 System.out.println(); 
		
		 usingThreePointersTechnique(a, b , c);
		 System.out.println();
		 
		usingHashSet(a, b ,c);
		
		System.out.println();
		
		Set<Integer> commonELmements = findCommonElements(a, b , c); // O(n^3)
		System.out.println(commonELmements);
		

	}

	private static void usingHashSet(int[] a, int[] b, int[] c) {
		HashSet<Integer> set1 = new HashSet<Integer>();
		HashSet<Integer> set2 = new HashSet<Integer>();
		
		for (int i : a)
		{
			set1.add(i);
		}
		
		for (int i : b)
		{
			set2.add(i);
		}
		
		System.out.print("\nCommon elements using set: ");
		for (int i : c)
		{
			if (set1.contains(i) && set2.contains(i))
			{
				// To maintain uniqueness remove elements from set which are present in both set
				set1.remove(i);
				set2.remove(i);
				System.out.print(i+" ");
			}
		}
	}

	private static void usingTwoPointersTechnique(int[] a, int[] b, int[] c) 
	{
		System.out.print("\nCommon elements: ");
		int i=0, j=0, k=0;
		
		int max = Math.max(a.length, b.length);
		max = Math.max(max, c.length);
		int[] tempArr = new int[max];
		
		while (i<a.length && j<b.length)
		{
			if (a[i] < b[j])
			{
				i++;
			}
			else if (a[i] > b[j])
			{
				j++;
			}
			else
			{
				tempArr[k++] = a[i];
				i++;
				j++;
			}	
		}
		
		i = 0;
		j = 0;
		while (i<tempArr.length && j<c.length)
		{
			if (tempArr[i] < c[j])
			{
				i++;
			}
			else if (tempArr[i] > c[j])
			{
				j++;
			}
			else
			{
				System.out.print(c[j] + " ");
				i++;
				j++;
			}
		}
		
		//System.out.println(Arrays.toString(tempArr));
	}

	private static void usingThreePointersTechnique(int[] a, int[] b, int[] c) 
	{
		int i =0, j=0, k=0;
		System.out.print("Common elements using three pointers: ");
		while (i< a.length && j<b.length && k < c.length)
		{
			if (a[i] == b[j] && b[j] == c[k])
			{
				System.out.print(a[i]+" ");
				i++;
				j++;
				k++;
			}
			else if (a[i] < b[j])
			{
				i++;
			}
			else if (b[j] < c[k])
			{
				j++;
			}
			else 
			{
				k++;
			}
		}
	}
	
	private static Set<Integer> findCommonElements(int[] arr1, int[] arr2, int[] arr3) {
		Set<Integer> set = new HashSet<Integer>();
	    for (int i = 0; i < arr1.length; i++) {
	        for (int j = 0; j < arr2.length; j++) {
	            for (int k = 0; k < arr3.length; k++) {
	                if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
	                    set.add(arr1[i]);
	                }
	            }
	        }
	    }
	    
	    return set;
	}
}
