package arrays;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 1, 2, 3, 4, 5 , 6, 3, 1, 4, 5, 7, 8 ,7 ,9};
		// 1, 2, 3, 4, 5, 6 ,7, 8, 9
		int count = 0;
		for (int i=0; i<a.length; i++)
		{
			for (int j=i+1; j<a.length; j++)
			{
				if (a[i] == a[j])
				{
					count++;
					break;
				}
			}
		}
		
		System.out.println(count);
		
		int[] uniqueArr = new int[count+1];
		int inx = 0;
		for (int i = 0; i < a.length; i++) 
		{
			count=0;
			for (int j = 0; j < uniqueArr.length; j++) 
			{
				if(a[i]==uniqueArr[j])
					count++;
			}
			if(count==0)
			{
				uniqueArr[inx++]=a[i];
			}
		}
		
		System.out.println(Arrays.toString(uniqueArr));

	}

}
