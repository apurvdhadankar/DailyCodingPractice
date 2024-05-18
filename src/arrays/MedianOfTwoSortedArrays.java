package arrays;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {
		/*
		 * Median of two sorted arrays of equal size: Input: Array1 = [1, 3, 5], Array2
		 * = [2, 4, 6] Explanation: After merging the two arrays, the combined sorted
		 * array is [1, 2, 3, 4, 5, 6]. The median of this array is the average of the
		 * middle two elements, which are 3 and 4, median is (3 + 4) / 2 = 3.5. Expected
		 * Output: Median = 3.5
		 */
		
		int[] a = {1, 3, 5};
		int[] b = {2, 4, 6, 7};
		
		int[] merged = new int[a.length + b.length];
		
		int i=0, j=0, x = 0;
		while (i < a.length && j < b.length)
		{
			if (a[i] < b[j])
			{
				merged[x++] = a[i++];
			}
			else
			{
				merged[x++] = b[j++];
			}
		}
		
		while (i < a.length)
		{
			merged[x++] = a[i++];
		}
		
		while (j < b.length)
		{
			merged[x++] = b[j++];
		}
		
		System.out.println(Arrays.toString(merged));
		
		double medain;
		if (merged.length % 2 == 0)
		{
			i = merged[merged.length/2];
			j = merged[merged.length/2 - 1];
			System.out.println(i + " "+ j);
			medain = (i + j) / 2.0;
		}
		else
		{
			medain = merged[merged.length /2] / 2;
		}
		
		System.out.println(medain);
	}

}
