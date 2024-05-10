package arrays;

import java.util.Arrays;

public class AD_SelectionSort {

	public static void main(String[] args) {
		int[] a = {4, 5, 6, 7, 0, 1, -5, 7, 3, 13, 5, 12};
		// Selects minimum element and and store to left position
		selectionSort(a);
		System.out.println(Arrays.toString(a));
	}

	private static void selectionSort(int[] a)
	{
		for (int i=0; i < a.length - 1; i++)
		{
			int minIndex = i;
			for (int j = i+1; j < a.length; j++)
			{
				if (a[j] < a[minIndex])
				{
					minIndex = j;
				}
			}
			
			// swap the minimum element at ith position
			int temp = a[i];
			a[i] = a[minIndex];
			a[minIndex] = temp;
		}
		
	}

}
