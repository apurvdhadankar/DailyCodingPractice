package arrays;

public class FIndAPairWhoseSumClosetToZero {

	public static void main(String[] args) {
		/*
		 * Example: Input: N = 3, arr[] = {-8 -66 -60} Output: -68 Explanation: Sum of
		 * two elements closest to zero is -68 using numbers -60 and -8. Input: N = 6,
		 * arr[] = {-21 -67 -37 -18 4 -65} Output: -14 Explanation: Sum of two elements
		 * closest to zero is -14 using numbers -18 and 4.
		 */
		
		int[] a = {-8, -66, -60};
		System.out.println(findPair(a)); //O(n^2)

	}

	private static int findPair(int[] a) 
	{
		int min = 0, res = Integer.MAX_VALUE;
		for (int i=0; i<a.length; i++)
		{
			for (int j=i+1; j<a.length; j++)
			{
				int temp = a[i] + a[j];
				if (temp <= 0)
				{
					min = a[i] + a[j];
					System.out.print("(" + a[i] +" "+ a[j]+ ") ");
				}
			}
			
			res = Math.min(Math.abs(res), Math.abs(min));
		}
		
		return -res;
		
	}

}
