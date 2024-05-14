package arrays;

import java.util.Arrays;

public class FindMissingNumber {

	public static void main(String[] args) {
		int[] a = {3, 7, 1, 2, 8, 4, 5}; // OP: 6
		int[] b = Arrays.copyOf(a, a.length);
		int missingElement = findMissingElementUsingSortingAnArray(a); // O(n^2) + O(n)
		System.out.println(missingElement);
		
		missingElement = findMissingElementUsingSummationOfAllNaturalNumbers(b); // O(n)
		System.out.println(missingElement);

	}

	private static int findMissingElementUsingSortingAnArray(int[] a)
	{
		for (int i=0; i<a.length; i++)
		{
			for (int j=0; j<a.length; j++)
			{
				if (a[i] < a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(a));
		
		for (int i = 0; i < a.length-1; i++) 
		{
			int temp = a[i] + 1;
			if (temp != a[i+1])
			{
				return temp;
			}
		}
		return 0;
	}
	
	private static int findMissingElementUsingSummationOfAllNaturalNumbers(int[] b) 
	{
		int n = b.length + 1;
		int sum = 0;
		for (int i=0; i<b.length; i++)
		{
			sum += b[i];
		}
		
		return (n * (n+1)/2 - sum);
	}

}
