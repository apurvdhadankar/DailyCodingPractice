package arrays;

import java.util.Arrays;

public class MinimumOperationRequredToMakeArrPalindrome {

	public static void main(String[] args) {
		/*
		 * Input : arr[] = {15, 4, 15} Output : 0 Array is already a palindrome. So we
		 * do not need any merge operation. Input : arr[] = {1, 4, 5, 1} Output : 1 We
		 * can make given array palindrome with minimum one merging (merging 4 and 5 to
		 * make 9) Input : arr[] = {11, 14, 15, 99} Output : 3 We need to merge all
		 * elements to make a palindrome.
		 */
		
		int[] a = {11, 14, 15, 99};
		findMinOperations(a);

	}

	private static void findMinOperations(int[] a) 
	{
		int i = 0;
		int j = a.length - 1;
		
		int cnt = 0;
		while(i <= j)
		{
			if (a[i] == a[j])
			{
				i++;
				j--;
			}
			else if (a[i] > a[j])
			{
				j--;
				a[j] = a[j] + a[j+1];
				cnt++;
			}
			else
			{
				i++;
				a[i] = a[i] + a[i-1];
				cnt++;
			}
		}
		
		System.out.println(cnt);
		System.out.println(Arrays.toString(a));
		
	}

}
