package arrays;

import java.util.Arrays;

public class AD_ClockWiseRotationTwoTimes {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		int[] b = Arrays.copyOf(a, a.length);
		// 1st: 5, 1, 2, 3, 4
		// 2nd: 4, 5, 1, 2, 3 <- OP
		
		rotateByShiftingElementsAhead(a, 2);
		System.out.println(Arrays.toString(a));
		
		rotateUsingTwoPointers(b, 2);
		System.out.println(Arrays.toString(b));
	}

	private static void rotateUsingTwoPointers(int[] b, int rotationTimes) 
	{
		while (rotationTimes > 0)
		{
			int i = 0, j = b.length-1;
			while (i != j)
			{
				int temp = b[i];
				b[i] = b[j];
				b[j] = temp;
				i++;
			}
			
			rotationTimes--;
		}
	}

	private static void rotateByShiftingElementsAhead(int[] a, int rotationTimes)
	{
		while (rotationTimes > 0)
		{
			int temp = a[a.length-1];
			
			for (int i=a.length-1; i>0; i--)
			{
				a[i] = a[i-1];
			}
			
			a[0] = temp;
			rotationTimes--;
		}
		
	}

}
