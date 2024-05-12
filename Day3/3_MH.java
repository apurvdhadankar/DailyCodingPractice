import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Array " + Arrays.toString(arr));

        rotateArray(arr);

        System.out.println("Rotated Array " + Arrays.toString(arr));
    }

//Just need to move the last element to first thats it
    public static void rotateArray(int[] arr) {
        int n = arr.length;
        int temp = arr[n - 1];

        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = temp;
    }
}