package practice;

public class Sorting_MIN_MAX_without_inbuildfunction {
	
	    public static void main(String[] args) {
	        // Example array
	        int arr[] = {5, 3, 8, 1, 9, 2};
int b=arr.length;
int a=arr[b];
System.out.println(a);
	        // Initialize min and max with the first element of the array
	        int min = arr[0];
	        int max = arr[0];

	        // Loop through the array to find min and max
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] < min) {
	                min = arr[i];  // Update min if a smaller element is found
	            }
	            if (arr[i] > max) {
	                max = arr[i];  // Update max if a larger element is found
	            }
	        }

	        // Print the results
	        System.out.println("Minimum Value: " + min);
	        System.out.println("Maximum Value: " + max);
	    }
	}


