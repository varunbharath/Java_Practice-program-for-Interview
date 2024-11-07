package practice;

public class arrayrotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = new int[] {2, 78, 90, 76, 65, 87};
	        int n = 3; // Number of positions to rotate

	        // Rotate the array n times
	        for (int i = 0; i < n; i++) {
	            int first = arr[0];
	            int j;
	            for (j = 0; j < arr.length - 1; j++) {
	                arr[j] = arr[j + 1];
	            }
	            arr[j] = first;
	        }

	        // Print the rotated array
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	
}
