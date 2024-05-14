import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Factorial {
    public static void main(String[] args) {
       
        int[] arr = {1, 2, 3, 4, 5};
        int factorial = findFactorialOfLargeNumber(arr);

                System.out.println("The factorial of the largest number " + factorial);



}
public static int findFactorialOfLargeNumber(int[] arr) {
    if (arr == null || arr.length == 0) {
        return 0;
    }

    int max = 0; 

    // Find the largest number in the array
    for (int num : arr) {
        if (num > max) {
            max = num;
        }
    }

     if (max < 0) {
        System.out.println("Cant find Factorial for negative number");
    }

    if (max == 0 || max == 1) {
        return 1; 
    }

    int fact = 1;
    for (int i = 2; i <= max; i++) {
        fact *= i;
    }

    return fact;
}

}
