package practice;
import java.util.Arrays;
public class SortMinMax {
	

	
	    public static void main(String[] args) {
	        // Example array
	        int arr[] = {5, 3, 8, 1, 9, 2};

	        // Sorting the array
	        Arrays.sort(arr);

	        // Printing the sorted array
	        System.out.println("Sorted Array: " + Arrays.toString(arr));

	        // Minimum value (first element after sorting)
	        int min = arr[0];

	        // Maximum value (last element after sorting)
	        int max = arr[arr.length - 1];

	        System.out.println("Minimum Value: " + min);
	        System.out.println("Maximum Value: " + max);
	    }
	}



