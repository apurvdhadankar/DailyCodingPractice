package arrays;

import java.util.Arrays;

public class AD_CycliCallyRotateAnArrayByOne {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		int[] b = Arrays.copyOf(a, a.length);
		//OP: 5, 1, 2, 3, 4
		
		rotateAnArrayByOne(a); // Using two pointers O(n)
		System.out.println(Arrays.toString(a));
		
		
		rotate(b);
		
	}

	/*
	 * 1. 1 will swap with 5 -> 5, 2, 3, 4, 1
	 * 2. 2 will swap with 1 -> 5, 1, 3, 4, 2
	 * 3. 3 will swap with 3 -> 5, 1, 2, 4, 3
	 * 4. 4 will swap with 3 -> 5, 1, 2, 3, 4
	 */
	private static void rotateAnArrayByOne(int[] a)
	{
		int i=0, j=a.length-1;
		while (i != j)
		{
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
		}
		
	}
	
	// Store last element
		// Shift every element 1 step ahead
		// in last place stored temp element at first
		private static void rotate(int[] b) 
		{
			int temp = b[b.length-1];
			for (int i=b.length-1; i>0; i--)
			{
				b[i] = b[i-1];
				System.out.println(Arrays.toString(b));
			}
			
			b[0] = temp;
			System.out.println(Arrays.toString(b));
			
		}

}
