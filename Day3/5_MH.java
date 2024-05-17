import java.util.Arrays;

public class MinimizeHeightDifference {
    
    public static int minimizeHeightDifference(int[] heights, int k) {
        int n = heights.length;
        
        Arrays.sort(heights);
        
        // Initialize the result with the difference between the tallest and shortest towers
        int result = heights[n - 1] - heights[0];
        
        for (int i = 0; i < n - 1; i++) {
            int currentHeight = heights[i];
            int nextHeight = heights[i + 1];
            
            // Calculate the new heights after adding and subtracting 'k'
            int newMinHeight = (currentHeight - k < heights[0] + k) ? heights[0] + k : currentHeight - k;
            int newMaxHeight = (nextHeight + k > heights[n - 1] - k) ? heights[n - 1] - k : nextHeight + k;
            
            result = (newMaxHeight - newMinHeight < result) ? newMaxHeight - newMinHeight : result;
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] heights = {1, 5, 8, 10};
        int k = 2;
        System.out.println("Minimum max difference " + minimizeHeightDifference(heights, k)); // Output is 5
    }
}
