//Online Java Compiler
//Use this editor to write, compile and run your Java code online

class MoveNegatives
{
 public static void main(String[] args) {
int[] arr = { -2, 5, -1, 8, -3, 0, 4, -7 };
moveNegs(arr);

System.out.println(Arrays.toString(arr));

int[] result = moveNegSeparateArray(arr);
System.out.println(Arrays.toString(result));

public static void moveNegs(int[] arr) {
 int left = 0;
 int right = arr.length - 1;

//Most simple approach
//If arr[left] is neg move left one step forward
//If arr[right] is pos move right one step backward
//If arr[left] is pos and arr[right] is neg, swap them and move both
 while (left < right) {
     if (arr[left] < 0) {
         left++;
     } else if (arr[right] >= 0) {
         right--;
     } else {
         // Swap arr[left] and arr[right]
         int temp = arr[left];
         arr[left] = arr[right];
         arr[right] = temp;

         left++;
         right--;
     }
 }
}
//Create same size array
//Add negative elements to the new array from the beginning.
//Add positive elements to the new array from the end.
 public static int[] moveNegSeparateArray(int[] arr) {
 int[] result = new int[arr.length];
 int left = 0;
 int right = arr.length - 1;

 for (int element : arr)
{
     if (element < 0) {
         result[left++] = element;
     } else {
         result[right--] = element;
     }
 }

 return result;
}

 }
}
