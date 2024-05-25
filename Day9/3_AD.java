package arrays;

public class FindMinMax2DArray {
	public static void main(String[] args) {
		int[][] a = {
				{5, 7},
				{6, 3},
				{6, 8},
				{14, 10}
				};
		
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		
		for (int i=0; i<a.length; i++) //row
		{
			for (int j=0; j<a[i].length; j++) //col
			{
				if (a[i][j] < min)
				{
					min = a[i][j];
				}
				if (a[i][j] > max)
				{
					max = a[i][j];
				}
			}
		}
		
		System.out.println("min -> " + min + "\nMax -> " + max);
	}

}
