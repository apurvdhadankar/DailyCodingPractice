package arrays;

public class FIndMinimumElementInSortedndRotatedArray {

	public static void main(String[] args) {
		// int[] nums = {4, 5, 6, 7, 0, 1, 2};
		// System.out.println(findMin(nums)); // Output: 0
		// Explanation: The minimum element in the rotated and sorted array is 0.

		int[] nums = {4, 5, 6, 7, 0, 1, 2};
		findMin(nums);
		
		System.out.println(findMinUsingBinarySearch(nums, 0, nums.length-1));
		
	}
	

	private static void findMin(int[] nums)
	{
		int min = nums[0];
		for (int i =1; i< nums.length; i++)
		{
			if (nums[i] < min)
			{
				min = nums[i];
			}
		}
		
		System.out.println(min);
	}
	
	private static int findMinUsingBinarySearch(int[] a, int low, int high) 
	{
		// if the array is not rotated
		if (a[low] < a[high])
		{
			return a[low];
		}
		
		int min = Integer.MAX_VALUE;
		while (low <= high)
		{
			int mid = (low+high) / 2;
			if (a[mid] == a[low] && a[mid] == a[high])
			{
				min = Math.min(min, a[mid]);
				low++;
				high--;
			}
			else if (a[mid] > a[high])
			{
				low = mid+1;
			}
			else 
			{
				min = Math.min(min, a[mid]);
				high = mid - 1;
			}
		}
		
		return min;
	}

}
