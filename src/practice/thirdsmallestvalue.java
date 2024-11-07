package practice;

import java.util.Arrays;

public class thirdsmallestvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {56,90,46,89,54,23,78,90,456,74,345,8754,24,};
int storedvalueforarr=arr.length;
Arrays.sort(arr);

// 3 rd largest value
System.out.print("3 rd largestvalue"+arr[2]);
		
	}

}
