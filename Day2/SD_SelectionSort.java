
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
		int [] arr = {1,9,8,5,2,4,6,5,7,6};
		System.out.println("Before Selection sort: " + Arrays.toString(arr));
		selectionSort(arr);
		System.out.println("After Selection sort: "+ Arrays.toString(arr));
		
	}
	
	 // O(n)  time complexity
	 
	public static void selectionSort(int [] arr){
	    // iterate the Array
	    for (int i = 0; i<arr.length-1 ;i++ ){
	        
	        //find the min element from an Arrays
	        int minIndex = i;
	        for (int j = i+1;j<arr.length ;j++ ){
	            if (arr[j]<arr[minIndex]){
	                minIndex=j;
	            } 
	        } 
	        
	        //swap the element 
	        int temp = arr[minIndex];
	        arr[minIndex]=arr[i];
	        arr[i]=temp;
	    } 
	    
	}
}