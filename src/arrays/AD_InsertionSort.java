package arrays;

import java.util.Arrays;

public class AD_InsertionSort {

	public static void main(String[] args) {
		int[] a = {4, 5, 6, 7, 0, 1, -5, 7, 3, 13, 5, 12};
		insertionSort(a);
		System.out.println(Arrays.toString(a));
	}
	
	// 2, 5, 1, 3
	// 1-> 2, 5 , 1, 3
	// 2-> 1, 2, 5, 3
	// 3-> 1, 2, 3, 5
	private static void insertionSort(int[] a)
	{
		for (int i = 1; i<a.length; i++)
		{
			for (int j = i-1; j >= 0; j--)
			{
				if (a[j] > a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
				else
				{
					break;
				}
			}
		}
	}

}
