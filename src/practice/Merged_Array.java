package practice;
import java.util.Arrays;
public class Merged_Array {
	 
	    public static void main(String[] args) {
	        int arr[] = {1, 3, 5};
	        int arr2[] = {2, 4, 7};
	        int merged[] = new int[arr.length + arr2.length];  // merged should be an array
	        
	        // Merging the arrays
	        System.arraycopy(arr, 0, merged, 0, arr.length);
	        System.arraycopy(arr2, 0, merged, arr.length, arr2.length);
	        
	        // Printing the merged array
	        System.out.println(Arrays.toString(merged));
	    }
	}



