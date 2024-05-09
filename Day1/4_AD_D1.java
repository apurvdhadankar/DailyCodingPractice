package arrays;

import java.util.Arrays;

public class AD_4_SortZerosOnesAndTwos {

	public static void main(String[] args) {
		int[] a = {1, 0, 2, 0, 0, 0, 0, 2, 2, 1, 0,2, 1, 0};
		int cnt1 =0, cnt2 = 0, cnt3 = 0;
		for (int i = 0; i < a.length; i++)
		{
			if (a[i] == 0)
			{
				cnt1++;
			}
			if (a[i] == 1)
			{
				cnt2++;
			}
			if (a[i] == 2)
			{
				cnt3++;
			}
		}
		
		int x = 0;
		while (cnt1 > 0)
		{
			a[x++] = 0;
			cnt1--;
		}
		while (cnt2 > 0)
		{
			a[x++] = 1;
			cnt2--;
		}
		while (cnt3 > 0)
		{
			a[x++] = 2;
			cnt3--;
		}
		
		System.out.println(Arrays.toString(a));

	}

}
