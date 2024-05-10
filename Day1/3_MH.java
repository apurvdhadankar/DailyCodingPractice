// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class ReverseArray {
    public static void main(String[] args) {
        int[] myArray = {8, 4, 6, 2, 1, 6, 7};
        //3rd max and min
        int k = 3; 
        sort(myArray);

        int kthMax = myArray[myArray.length - k];
        System.out.println("K max " + kthMax);

        // Find Kth minimum element
        int kthMin = myArray[k - 1];
        System.out.println("K min" + kthMin);
    }
    
    private static void sort(int[] myArray) {
        int n = myArray.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (myArray[j] > myArray[j + 1]) {
                    
                    int temp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = temp;
                }
            }
        }
    }
}