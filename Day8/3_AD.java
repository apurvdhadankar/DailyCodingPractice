package arrays;

import java.util.Arrays;

public class NextPermutation {
	public static void nextPermutation(int[] nums)
	{
		/*
		 * Input: N = 6, arr = {1, 2, 3, 6, 5, 4}
		Output: {1, 2, 4, 3, 5, 6}
		Explanation: The next permutation of the given array is {1, 2, 4, 3, 5, 6}.

		Input: N = 3, arr = {3, 2, 1}
		Output: {1, 2, 3}
		Explanation: As arr[] is the last permutation. 
		So, the next permutation is the lowest one.
		 */
		
        // Find the first element from the right that is not in decreasing order
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1])
        {
            i--;
        }
        // If such an element is found, find the smallest element from the right that is greater than it
        if (i >= 0) 
        {
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) 
            {
                j--;
            }
            // Swap the two elements
            swap(nums, i, j);
        }
        // Reverse the elements from i+1 to the end to get the next permutation
        reverse(nums, i + 1);
    }

    private static void swap(int[] nums, int i, int j) 
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int start) 
    {
        int i = start, j = nums.length - 1;
        while (i < j) 
        {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 6, 5, 4 };
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }

}
