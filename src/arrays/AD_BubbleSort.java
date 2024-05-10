package arrays;

import java.util.Arrays;

public class AD_BubbleSort {

	public static void main(String[] args) {
		int[] a = {4, 5, 6, 7, 0, 1, -5, 7, 3, 13, 5, 12};
		bubbleSort(a);
		System.out.println(Arrays.toString(a));
	}

	// Time: O(N^2)
	// Advantage of this is if elements are already sorted it only takes O(n)
	private static void bubbleSort(int[] a) 
	{
		for (int i=0; i<a.length-1; i++)
		{
			boolean swapped = false;
			for (int j =0; j < a.length - i - 1; j++) 
				// (a.length - i - 1) -> because in bubble sort rightmost element is always sorted 
			{
				if (a[j] > a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					swapped = true;
				}
			}
			// If no elements are swapped it means sorting is completed
			//  Advantage of this is if elements are already sorted it only takes O(n)
			if (swapped == false)
			{
				break;
			}
		}
	}

}
