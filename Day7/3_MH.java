import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Solution {
    public static double findMed(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] merged = new int[n + m];
        int i = 0, j = 0, k = 0;

        // Merge arrays
        while (i < n && j < m) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }

        int mid = merged.length / 2;
        if (merged.length % 2 == 0) {
            //If merged array is even then we can take two elements
            return (merged[mid - 1] + merged[mid]) / 2.0;
        } else {
            // If merged array has an odd length then return middle element
            return merged[mid];
        }
    }


    public static void main(String[] args) {
        int nums1[] = {1, 12, 15, 26, 38};
        int nums2[] = {2, 13, 17, 30, 45};
        //Output => 16
        System.out.println(findMed(nums1, nums2)); 
    }
}

