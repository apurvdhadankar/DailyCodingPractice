// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class MaxMinInArray {
    public static void main(String[] args) {
     int[] array = {8, 4, 6, 2, 1, 6, 7};
     
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Max " + max);
        
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Min " + min);
        
        //Using Stream
        int max1 = Arrays.stream(array).max().getAsInt();
        System.out.println("Max " + max);
        int min1 = Arrays.stream(array).min().getAsInt();
        System.out.println("Min " + min);
    }
}