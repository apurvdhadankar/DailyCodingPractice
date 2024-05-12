public class MaxSubarraySum {
    public static void main(String[] args) {
        int[] arr = {-4, 5, -2, 1, -2, 1, 5, -1, 4};
        int maxSum = findMaxSubarraySum(arr);
        System.out.println("Maximum subarray sum: " + maxSum); // Print sub array as well
    }

    public static int findMaxSubarraySum(int[] arr) {
// Initialize max sum with the first element
        int maxSum = arr[0]; 
// Initialize current sum with the first element
        int testSum = arr[0]; 

        for (int i = 1; i < arr.length; i++) {
            // Update current sum
            if (testSum < 0) {
                testSum = 0;
            }
            testSum += arr[i];

            // Update max sum
            if (testSum > maxSum) {
                maxSum = testSum;
            }
        }

        return maxSum;
    }
}
