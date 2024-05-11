package arrays;

import java.util.Arrays;

public class AD_MoveNegativeElementsOneSide {

	public static void main(String[] args) {
		int[] a = {-90, 5, 7 , -9, -7, 1, 2, 4, -5, -6, -7, -8, 4, 3, 2, 12, -65, 7, -8};
		
		// 1. With sorting -> O(n^2)
		int[] sortedArr = sortAnArray(a);
		System.out.println(Arrays.toString(sortedArr));
		
		//2. With partition technique -> O(n)
		int[] partionArr = partition(a);
		System.out.println(Arrays.toString(partionArr));
		
		// 3. two pointers -> O(n)
		twoPointers(a);
		System.out.println(Arrays.toString(a));
		

	}


	private static int[] sortAnArray(int[] a) 
	{
		int[] sortedArr = Arrays.copyOf(a, a.length);
		for (int i = 0; i < sortedArr.length; i++) 
		{
			for (int j = 0; j < sortedArr.length; j++) 
			{
				if (sortedArr[i] < sortedArr[j])
				{
					int temp = sortedArr[i];
					sortedArr[i] = sortedArr[j];
					sortedArr[j] = temp;
				}
			}
		}
		return sortedArr;
	}
	
	private static int[] partition(int[] a) 
	{
		int[] partionedArr = Arrays.copyOf(a, a.length);
		int j = 0;
		for(int i=0; i<partionedArr.length; i++)
		{
			if (partionedArr[i] < 0)
			{
				if (i != j)
				{
					int temp = partionedArr[i];
					partionedArr[i] = partionedArr[j];
					partionedArr[j] = temp;
				}
				j++;
			}
		}
		
		return partionedArr;
	}
	
	private static void twoPointers(int[] a) 
	{
		// i-> 1, -3, -4, -5,j->  6
		// j-- : i-> 1, -3, -4, j-> -5, 6
		// i++, j-- swap : -5, i-> -3, j-> -4, 1, 6 
		
		int i =0, j= a.length -1;
		while (i <= j)
		{
			if (a[i] > 0 && a[j] < 0)
			{
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				j--;
				i++;
			}
			else if (a[i] > 0 && a[j] > 0)
			{
				j--;
			}
			else if (a[i] < 0 && a[j] < 0)
			{
				i++;
			}
			else 
			{
				i++;
				j--;
			}
		}
		
	}


}
