package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AD_3_FindKthMinAndMaxElement {

	public static void main(String[] args) {
		int[] a = {5, 6, 1, 2, 4, 6, 8, 3};
		int k = 4;
		Arrays.sort(a);
		System.out.println("Kth smallest -> " + a[k-1]);
		
		for (int i = 0; i < a.length/2; i++) 
		{
			int temp = a[i];
			a[i] = a[a.length-1-i];
			a[a.length-1-i] = temp;
		}
		
		System.out.println(Arrays.toString(a));
		
		System.out.println("Kth Largest -> " + a[k-1]);
		
		
		

	}

}
