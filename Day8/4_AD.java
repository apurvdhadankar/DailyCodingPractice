package arrays;

public class InversionCount {

	public static void main(String[] args) {
		/*
		 * Input: arr[] = {8, 4, 2, 1} Output: 6 Explanation: Given array has six
		 * inversions: (8, 4), (4, 2), (8, 2), (8, 1), (4, 1), (2, 1). Input: arr[] =
		 * {1, 20, 6, 4, 5} Output: 5 Explanation: Given array has five inversions: (20,
		 * 6), (20, 4), (20, 5), (6, 4), (6, 5).
		 * 
		 */
		
		int[]  a = {8, 4, 2, 1};
		System.out.println(usingTwoLoops(a));

	}

	private static int usingTwoLoops(int[] a) 
	{
		int inversionCount = 0;
		for (int i=0; i<a.length-1; i++)
		{
			for (int j=i+1; j<a.length; j++)
			{
				if (a[i] > a[j])
				{
					inversionCount++;
				}
			}
		}
		return inversionCount;
	}

}
