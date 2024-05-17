import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaxSubarraySum {
    public static void main(String[] args) {
       
    int[] arr1 = {1, -3, 5, 6, -7, 9, -10, -19, 20};
    arrangeByPosNeg(arr1);
    System.out.println(Arrays.toString(arr1));

}
//First Minus and then Plus TC-> O(n) as no nested loops
public static void arrangeByPosNeg(int[] arr) {
        List<Integer> positives = new ArrayList<>();
        List<Integer> negatives = new ArrayList<>();

        // Separate positive and negative numbers
        for (int num : arr) {
            if (num >= 0)
                positives.add(num);
            else
                negatives.add(num);
        }

        int i = 0, j = 0, k = 0;
    //add positive and negative number in array one by one
        while (i < positives.size() && j < negatives.size()) {
            arr[k++] = negatives.get(j++);
            arr[k++] = positives.get(i++);
        }

        // add remaining numbers if available
        while (i < positives.size()) {
            arr[k++] = positives.get(i++);
        }

        // add remaining numbers if avaiable
        while (j < negatives.size()) {
            arr[k++] = negatives.get(j++);
        }
    }


}
