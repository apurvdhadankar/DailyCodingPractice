import java.util.Arrays;

public class MinimizeHeightDifference {
    
    public static int minimizeHeightDifference(int[] heights, int k) {
        int n = heights.length;
        
        Arrays.sort(heights);
        
        // find the difference between the tallest and shortest element
        int result = heights[n - 1] - heights[0];
        
        for (int i = 0; i < n - 1; i++) {
            int currentHeight = heights[i];
            int nextHeight = heights[i + 1];
            
            // Calculate new heights after add and sub k
            int newMinHeight = (currentHeight - k < heights[0] + k) ? heights[0] + k : currentHeight - k;
            int newMaxHeight = (nextHeight + k > heights[n - 1] - k) ? heights[n - 1] - k : nextHeight + k;
            
            // find the result between min and max
            //Ex from above newMin and Max Height
            //For the first tower value is 1, so new heights after adding or subtracting k are 1 + 2 = 3 and 1 - 2 = -1. 
            //but, we cannot have negative heights so we take the minimum as 3.similarly for others
            result = (newMaxHeight - newMinHeight < result) ? newMaxHeight - newMinHeight : result;
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] heights = {1, 5, 8, 10};
        int k = 2;
        System.out.println("Min max difference " + minimizeHeightDifference(heights, k)); // Output: 5
    }
}
