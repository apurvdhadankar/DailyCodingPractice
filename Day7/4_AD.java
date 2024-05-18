package arrays;

public class MedianOfTwoSortedArrays2 {

	public static void main(String[] args) {
		/*
		 * **Median of two sorted arrays of different sizes:** - Input: Array1 = [1, 3,
		 * 8, 9, 15], Array2 = [7, 11, 18, 19, 21, 25] - Explanation: After merging the
		 * two arrays, the combined sorted array is [1, 3, 7, 8, 9, 11, 15, 18, 19, 21,
		 * 25]. The median of this array is the middle element, which is 11. - Expected
		 * Output: Median = 11
		 */
		
		int[] a = {1, 3, 8, 9, 15};
		int[] b = {7, 11, 18, 19, 21, 25};
		int i=0, j=0, x = 0;
		int[] m = new int[a.length + b.length];
		while (i < a.length && j<b.length)
		{
			if (a[i] < b[j])
			{
				m[x++] = a[i++];
			}
			else
			{
				m[x++] = b[j++];
			}
		}
		
		while (i < a.length)
		{
			m[x++] = a[i++];
		}
		while (j < b.length)
		{
			m[x++] = b[j++];
		}
		
		int mid = m.length/2;
		
		if (m.length % 2 == 0)
		{
			double evenMid = (m[mid] + m[mid-1]) / 2;
			System.out.println(evenMid);
		}
		else
		{
			System.out.println(m[mid]);
		}
	}

}
