import java.util.Arrays;

public class Main
{
  public static void main (String[]args)
  {

	int[] arr = { 5, 6, 1, -0, -8, 6, 4, 13, 5, 9 };

	reverseArray (arr);

	System.out.println ('\n' + "Min and Max Value from an array");
	minMax (arr);
	
	System.out.println ("largest kth element: " + findKthLargest (arr, 5));
	System.out.println ("smallest kth element: " +findKthSmallest (arr, 3));


    int [] a = {0,1,0,1,0,2,0,1,1,0,2,1,0,2,1,0,2};
     sortArray(a);
     System.out.println("Sorted array: " + Arrays.toString(a));
    
  }



  // Reverse an Array ------------------------------------------------
  public static void reverseArray (int arr[])
  {
	System.out.println ("Reverse an Array: ");
	for (int i = arr.length - 1; i >= 0; i--)
	  {
		System.out.print (arr[i]);
	  }
  }



  //Find min and max from the array ----------------------------------
  public static void minMax (int arr[])
  {
	int min = Integer.MAX_VALUE;
	int max = Integer.MIN_VALUE;
	for (int i = 0; i < arr.length; i++)
	  {
		if (arr[i] < min)
		  {
			min = arr[i];
		  }
		if (arr[i] > max)
		  {
			max = arr[i];
		  }
	  }
	System.out.println ("MIN -> " + min + '\n' + "MAX -> " + max);
  }




  //find the Kth largest number from the array -------------------------
  public static int findKthLargest (int[]nums, int k)
  {
	Arrays.sort (nums);
	return nums[nums.length - k];
  }



  //find the Kth smallest number from the array ------------------------
  public static int findKthSmallest (int[]nums, int k)
  {
	Arrays.sort (nums);
	return nums[k - 1];
  }



    //Given an array which consists of only 0, 1 and 2 sort the array -
    //without using any sorting algorithm in Java
    
    public static void sortArray(int[] arr) {
        int count0 = 0, count1 = 0, count2 = 0;
        
        for (int num : arr) {
            if (num == 0) count0++;
            else if (num == 1) count1++;
            else if (num == 2) count2++;
        }
        int index = 0;
        while (count0 > 0) {
            arr[index++] = 0;
            count0--;
        }
        while (count1 > 0) {
            arr[index++] = 1;
            count1--;
        }
        while (count2 > 0) {
            arr[index++] = 2;
            count2--;
        }
    }
    
    
    
}
