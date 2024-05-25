package arrays;

import java.util.Arrays;

public class AllPossibePermutations {

	public static void main(String[] args) {
		int[] a = {1,2,3};
		permute(0, a.length-1, a);
		

	}

	private static void permute(int l, int r, int[] a) 
	{
		if (l == r)
		{
			System.out.println(Arrays.toString(a));
		}
		else
		{
			for (int x = l; x <= r; x++)
			{
				swap(x, l, a);
				permute(l+1, r, a);
				swap(x, l, a);
			}
		}
		
	}

	private static void swap(int x, int l, int[] a) 
	{
		int temp = a[x];
		a[x] = a[l];
		a[l] = temp;		
	}

}
