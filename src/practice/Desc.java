package practice;

import java.util.Arrays;
import java.util.Collections;

public class Desc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer[] arr = {6, 2, 1, 5, 2, 5, 9, 234, 864};
        
        // Sort the array in descending order
        Arrays.sort(arr, Collections.reverseOrder());

        // Print the sorted array
        System.out.println(Arrays.toString(arr));

	}

}
