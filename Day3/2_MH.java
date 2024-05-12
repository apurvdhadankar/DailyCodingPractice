// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.HashSet;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class HelloWorld {
    public static void main(String[] args) {
int[] arr1 = {1, 3, 5, 7, 9};
int[] arr2 = {2, 3, 5, 8, 10};

// Using HashSet
int[] union = findUnion(arr1, arr2);
System.out.println("Union " + Arrays.toString(union));

int[] intersection = findIntersection(arr1, arr2);
System.out.println("Intersection " + Arrays.toString(intersection));

// Using HashSet
int[] union1 = findUnion(arr1, arr2);
System.out.println("Union " + Arrays.toString(union));

int[] intersection1 = findIntersection(arr1, arr2);
System.out.println("Intersection " + Arrays.toString(intersection1));   
}

public static int[] findUnion(int[] arr1, int[] arr2) {
    HashSet<Integer> set = new HashSet<>();
    for (int num : arr1) {
        set.add(num);
    }
    for (int num : arr2) {
        set.add(num);
    }
    int[] union = new int[set.size()];
    int i = 0;
    for (int num : set) {
        union[i++] = num;
    }
    return union;
}

public static int[] findIntersection(int[] arr1, int[] arr2) {
    List<Integer> intersection = new ArrayList<>();
    int i = 0, j = 0;
    while (i < arr1.length && j < arr2.length) {
        if (arr1[i] < arr2[j]) {
            i++;
        } else if (arr1[i] > arr2[j]) {
            j++;
        } else {
            intersection.add(arr1[i]);
            i++;
            j++;
        }
    }
    int[] result = new int[intersection.size()];
    for (int k = 0; k < intersection.size(); k++) {
        result[k] = intersection.get(k);
    }
    return result;
}

//By stream
public static int[] findUnionByStream(int[] arr1, int[] arr2) {
    Set<Integer> set = new HashSet<>();
	//boxed is used to convert premitives to wrapper class
    set.addAll(Arrays.stream(arr1).boxed().collect(Collectors.toSet()));
    set.addAll(Arrays.stream(arr2).boxed().collect(Collectors.toSet()));
    return set.stream().mapToInt(Integer::intValue).toArray();
}

public static int[] findIntersectionByStream(int[] arr1, int[] arr2) {
    Set<Integer> set1 = Arrays.stream(arr1).boxed().collect(Collectors.toSet());
    Set<Integer> set2 = Arrays.stream(arr2).boxed().collect(Collectors.toSet());
    set1.retainAll(set2);
    return set1.stream().mapToInt(Integer::intValue).toArray();
}
}