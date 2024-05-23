package arrays;

import java.util.Arrays;

public class PartiotionAnArray {

	public static void main(String[] args) {
//		int[] a = {5, 4, 3, 2, 1, 0};
		int[] a = {3, 2, 6, 1, 7, 4};
		
		// OP: 3, 2, 1, 4, 7, 6
		 partitionAnArray(a); // shift all small elements to one side which are less than or equal to pivot
		 System.out.println(Arrays.toString(a));

	}

	private static void partitionAnArray(int[] a)
	{
		int pivot = a[a.length-1];
		int i=0, j=0;
		while (i < a.length)
		{
			// Swapping elements if element is <= pivot
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
		
	}

	private static void swap(int[] a, int i, int j) 
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		
	}

}
