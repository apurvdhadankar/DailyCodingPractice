package arrays;

import java.util.Arrays;

public class AD_MergeSort {

	public static void main(String[] args) {
		int[] a = {4, 5, 6, 7, 0, 1, -5, 7, 3, 13, 5, 12};
		System.out.println(Arrays.toString(divide(a, 0, a.length-1)));
	}

	private static int[] divide(int[] a, int si, int ei) 
	{
		if (si >= ei)
		{
			int[] baseArr = new int[1];
			baseArr[0] = a[si];
			return baseArr;
		}
		int mid = (si + ei) / 2;
		int[] firstHalf = divide(a, si, mid);
		int[] secondHalf = divide(a, mid+1, ei);
		return mergeTwoSortedArrays(firstHalf, secondHalf);
	
	}

	private static int[] mergeTwoSortedArrays(int[] firstHalf, int[] secondHalf)
	{
		int[] merged = new int[firstHalf.length + secondHalf.length];
		int i = 0, j= 0, x = 0;
		while (i < firstHalf.length && j < secondHalf.length)
		{
			if (firstHalf[i] > secondHalf[j])
			{
				merged[x++] = secondHalf[j++];
			}
			else
			{
				merged[x++] = firstHalf[i++];
			}
		}
		
		while (i < firstHalf.length)
		{
			merged[x++] = firstHalf[i++];
		}
		while (j < secondHalf.length)
		{
			merged[x++] = secondHalf[j++];
		}
		
		return merged;
	}

}
