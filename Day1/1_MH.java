// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class ReverseArray {
    public static void main(String[] args) {
    int[] myArray = {8,4,6,2,1,6,7};
    for(int i=myArray.length-1; i >= 0; i--){
         System.out.print(myArray[i] + "  ");
    }
    int[] reversedArray1 = IntStream.range(0, myArray.length)
                                .map(i -> myArray[myArray.length - 1 - i])
                                .toArray();
    
    }
}