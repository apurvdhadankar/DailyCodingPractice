import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
		int [] arr = {1,9,8,5,2,4,6,5,7,6};
		System.out.println("Before insertion sort: " + Arrays.toString(arr));
		insertionSort(arr);
		System.out.println("After insertion sort: "+ Arrays.toString(arr));
		
	}
	
	// time complexity - O(n)
	public static void insertionSort(int [] arr){
        for(int i=1; i< arr.length; i++){  
            
        // int i=1 bcz first element is always sorted    
            
            int temp = arr[i];   
            
            int j= i-1;  // step back to one step before
            
            while(j> 0 && arr[j]>temp){   
               arr[j+1] = arr[j];      // high value shift to right
               j--;     // j=j-1;
            }
            arr[j+1] = temp;   // save the value to temp left side
        }
	    
	    
	}
}