package arrays;

import java.util.Arrays;

public class FindAndRemoveDuplicates {

	public static void main(String[] args) {
		int[] a = {1, 4, 3, 2, 1, 2, 3, 4, 5, 7, 8 ,9, 7};
		int cnt = 0;
		for (int i=0; i<a.length-1; i++)
		{
			for (int j=i+1; j<a.length; j++)
			{
				if (a[i] == a[j])
				{
					cnt++;
				}
			}
		}
		
		System.out.println("Duplicate counts : "+ cnt);
		
		int[] b = new int[a.length - cnt];
		int indx = 0;
		for (int i=0; i<a.length; i++)
		{
			cnt = 0;
			for (int j=0; j<b.length; j++)
			{
				if (a[i] == b[j])
				{
					cnt++;
				}
			}
			if (cnt ==0)
			{
				b[indx++] = a[i];
			}
		}
		
		System.out.println(Arrays.toString(b));

	}

}
