import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaxSubarraySum {
    public static void main(String[] args) {
       
            int[] nums = {4, 2, -3, 1, 6};
        System.out.println("Does subarray is zero sum" + hasSubarraySumZero(nums));


}
TC -> O(n) as single loop is present
public static boolean hasSubarraySumZero(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int sum = 0;

        for (int num : nums) {
            sum += num;

            // If the current sum is zero or already exists in the set, there is a subarray with sum zero
	   //1st Iteration sum = 4
	   //2nd Iteration sum = 6
	   //3rd Iteration sum = 3
	   //4th Iteration sum = 4 which is already in set so we can say some of last elements are get minus as the sum value is available in set
            if (sum == 0 || set.contains(sum))
                return true;

            // Add sum
            set.add(sum);
        }
        return false;
    }

}
