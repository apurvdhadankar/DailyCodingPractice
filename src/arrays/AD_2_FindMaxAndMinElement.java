package arrays;

public class AD_2_FindMaxAndMinElement {

	public static void main(String[] args) {
		int[] a = {5, 6, 1, -0, -8, 6, 4, 13, 5, 9};
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) 
		{
			if (a[i] < min)
			{
				min = a[i];
			}
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		
		System.out.println("MIN -> " + min + '\n' + "MAX -> " + max);

	}

}
