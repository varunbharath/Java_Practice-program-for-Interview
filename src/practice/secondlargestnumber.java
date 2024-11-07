package practice;

import java.util.Arrays;

public class secondlargestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,8,9,46,87,54,87,90,64,34,234};
	    int Storedvaluearr	=arr.length;
     	Arrays.sort(arr);
     	//2nd largest value 
	System.out.print("2nd largest value"+arr[Storedvaluearr-2]);
	
	

	}

}
