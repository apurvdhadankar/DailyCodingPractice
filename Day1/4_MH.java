// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class SortOnOneTwoThree {
    public static void main(String[] args) {
        int[] myArray = {0, 1, 2, 1, 0, 2, 1, 0, 2, 1, 0};

        sort(myArray);

        System.out.println("Sorted array:");
        for (int value : myArray) {
            System.out.print(value + " ");
        }
    }

    private static void sort(int[] array) {
        int zeroOccurance = 0;
        int oneOccurance = 0;
        int twoOccurance = 0;

        //Count Occurrences of 0,1,2
        for (int num : array) {
            if (num == 0) {
                zeroOccurance++;
            } else if (num == 1) {
                oneOccurance++;
            } else if (num == 2) {
                twoOccurance++;
            }
        }

        int index = 0;
	//First add 0 then 1,2
        for (int i = 0; i < zeroOccurance; i++) {
            array[index++] = 0;
        }

        for (int i = 0; i < oneOccurance; i++) {
            array[index++] = 1;
        }

        for (int i = 0; i < twoOccurance; i++) {
            array[index++] = 2;
        }
    }
}

    
