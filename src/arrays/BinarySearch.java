package arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6 ,7 ,8 ,9 };
		int target = 4;
		
		int low = 0, high = a.length-1;
		while (low <= high)
		{
			int mid = (low + high) / 2;
			if (a[mid] == target)
			{
				System.out.println(mid);
				break;
			}
			else if (target > a[mid])
			{
				low = mid + 1;
			}
			else 
			{
				high = mid - 1;
			}
		}

	}

}
