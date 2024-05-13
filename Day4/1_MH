import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaxSubarraySum {
    public static void main(String[] args) {
       
    int[] arr1 = {1, 3, 4, 6, 7, 9};
    int[] arr2 = {1, 2, 4, 5, 9, 10};
    int[] arr3 = {1, 4, 9, 11, 12} ;
    findCommonElements(arr1,arr2,arr3);


//By Stream
List<Integer> list1 = Arrays.stream(arr1).boxed().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(arr2).boxed().collect(Collectors.toList());
        List<Integer> list3 = Arrays.stream(arr3).boxed().collect(Collectors.toList());

  List<Integer> list4= Stream.of(list1, list2, list3)
                .flatMap(List::stream)
                .distinct()
                .filter(num -> list1.contains(num) && list2.contains(num) && list3.contains(num))
                .collect(Collectors.toList());
                    System.out.print(list4);
   

}
//Simple way
static void findCommonElements(int[] arr1, int[] arr2, int[] arr3) {
    for (int i = 0; i < arr1.length; i++) {
        for (int j = 0; j < arr2.length; j++) {
            for (int k = 0; k < arr3.length; k++) {
                if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                    System.out.print(arr1[i] + " ");
                }
            }
        }
    }
}

}
