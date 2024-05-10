package arrays;

import java.util.Arrays;

public class AD_QuickSort {

	public static void main(String[] args) {
		int[] a = {4, 5, 6, 7, 0, 1, -5, 7, 3, 13, 5, 12};
		quickSort(a, 0, a.length-1);
		System.out.println(Arrays.toString(a));

	}
	
	private static void quickSort(int[] a, int si, int ei)
	{
		if (si >= ei)
		{
			return;
		}
		int pivot = a[ei];
		int pivotIndex = partition(a, pivot, si, ei);
		quickSort(a, si, pivotIndex -1);
		quickSort(a, pivotIndex + 1, ei);
	}
	private static int partition(int[] a, int pivot, int si, int ei)
	{
		int i  = si,  j = si;
		while (i <= ei)
		{
			if (a[i] <= pivot)
			{
				swap(a, i, j);
				i++;
				j++;
			}
			else
			{
				i++;
			}
		}
		
		// Pivot index
		return j -1;
		
	}
	
	private static void swap(int[] a, int i, int j)
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
