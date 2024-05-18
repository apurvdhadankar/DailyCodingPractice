public class MinimumPalindromeIterations {
    //Check if array is already palindrome
    public static boolean isPalindrome(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        
        while (i < j) {
            if (arr[i] != arr[j]) {
                return false;
            }
            i++;
            j--;
        }
        
        return true;
    }
    
    public static int minOperationsToPalindrome(int[] arr) {
        if (isPalindrome(arr)) {
            return 0;
        }
        
    int ans = 0; 
    int left = 0; // Left position
    int right = arr.length - 1; // Right position

    while (left <= right) {
        //If left and right are same then just move the positions
        if (arr[left] == arr[right]) {
            left++;
            right--;
        }
        // If left element is larger than right the combine rightside elements
        else if (arr[left] > arr[right]) {
            right--;
            arr[right] += arr[right + 1];
            ans++;
        }
        //combine left two elements
        else {
            left++;
            arr[left] += arr[left - 1];
            ans++;
        }
    }

    return ans;
    }

    public static void main(String[] args) {
        int[] arr = {45,12,26,85};
        //output -> 3
        System.out.println("Min iterations req " + minOperationsToPalindrome(arr));
    }
}
