package practice;

import java.util.Arrays;

public class Array_min_max {
	 static {
		 double arr[]= {23.34,56.78,87.45,23.67,87.09,45.78};
		double b =Arrays.stream(arr).max().getAsDouble();
		System.out.println("Array max"+b);
	 }

	 static {
	        int b[] = {23, 56, 78, 87, 45, 23, 67, 87, 9, 45, 78};
	        int min1 = Arrays.stream(b).min().getAsInt();  // Corrected method call
	        System.out.println("Minimum value: " + min1);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
