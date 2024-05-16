/* all the sorting technique is not best practice for sorting */
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
		int [] arr = {1,9,8,5,-1,-8};
		System.out.println("Before Bubble sort: " + Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println("After Bubble sort: "+ Arrays.toString(arr));
		
	}
	 // time complexity = 0(n^2)
	 
	public static void bubbleSort(int [] arr){
	    // iterate the Arrays
	    
	    for (int i = 0; i<arr.length-1 ;i++ ){  //n-1
            for (int j=0; j<arr.length-1 ;j++ ){
                
                if (arr[j]>arr[j+1]){
                    
                     //swap the element
	                int temp = arr[j];
	                arr[j]=arr[j+1];
	                arr[j+1]=temp;
                } 
            }
	    } 
	   //   System.out.println(arr);
	}
}